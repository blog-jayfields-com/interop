package interop;

import clojure.lang.RT;

public class Example {
    public static void main(String[] args) throws Exception {
        RT.loadResourceScript("interop/core.clj");
        clojure.lang.IFn f = (clojure.lang.IFn) RT.var("interop.core", "main").invoke();
        f.invoke("hello world");
    }
}
