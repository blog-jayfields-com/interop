package interop;

import clojure.lang.RT;

public class Example {
    public static void main(String[] args) throws Exception {
        clojure.lang.IFn f = (clojure.lang.IFn) RT.var("clojure.core", "println");
        f.invoke("hello world");
    }
}
