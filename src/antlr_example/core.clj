(ns antlr-example.core
  (:import (org.antlr.runtime ANTLRStringStream
                              CommonTokenStream)
           (antlr_example ExprLexer ExprParser)))


(defn parse-expr [s]
  (let [lexer (ExprLexer. (ANTLRStringStream. s))
        tokens (CommonTokenStream. lexer)
        parser (ExprParser. tokens)]
    (.getTree (.expr parser))))

(defn node-seq [x]
  (map #(.getText %)
   (tree-seq #(not (zero? (.getChildCount %)))
             #(.getChildren %)
             x)))

(defn AST [node]
  (if (zero? (.getChildCount node))
    (read-string (.getText node))
    (let [children (map AST (.getChildren node))
          txt (read-string (.getText node))]
      (if txt
        (cons txt children)
        children))))

