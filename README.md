Answer to this StackOverflow question: https://stackoverflow.com/questions/60321130/how-can-i-use-clojure-as-scripting-language-for-a-java-program


Run it:
```
lein javac
java -cp `lein cp` interpreter.Runner "(do (tools/print-version) (tools/cos 1))"
```
