# antlr-example

A simple example of using ANTLR from Clojure.

See [my blog](http://briancarper.net/blog/554/antlr-via-clojure) for a detailed walkthrough of this code.

# Install

    $ git clone git://github.com/briancarper/antlr-example.git
    $ cd antlr-example
    $ lein deps
    $ java -cp 'lib/*' org.antlr.Tool src/antlr_example/Expr.g
    $ javac -cp 'lib/*' -d classes src/antlr_example/Expr{Lexer,Parser}.java

## License

Eclipse Public License 1.0, see http://opensource.org/licenses/eclipse-1.0.php.
