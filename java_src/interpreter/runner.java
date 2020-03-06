package interpreter;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

class Runner{
    public static void main(String[] args){
        // Load the `require` function
        IFn require = Clojure.var("clojure.core", "require");

        // require the our clojure interpreter namespace
        require.invoke(Clojure.read("interpreter.core"));

        // Load extra operations we can use in our script
        IFn load_tools = Clojure.var("interpreter.core", "load-tools!");
        load_tools.invoke();

        // load the `eval-script`
        IFn eval_script = Clojure.var("interpreter.core", "eval-script");

        // execute it
        System.out.println(eval_script.invoke(args[0]));
    }
}
