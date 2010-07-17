# antlr-example

A simple example of using ANTLR from Clojure.

# Install

    $ git clone git://github.com/briancarper/antlr-example.git
    $ cd antlr-example
    $ lein deps
    $ java -cp 'lib/*' org.antlr.Tool src/antlr_example/Expr.g
    $ javac -cp 'lib/*' -d classes src/antlr_example/Expr{Lexer,Parser}.java

## License

Eclipse Public License 1.0, see http://opensource.org/licenses/eclipse-1.0.php.
