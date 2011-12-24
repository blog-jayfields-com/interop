package interop;

import clojure.lang.RT;

public class Example {
    public static void main(String[] args) throws Exception {
        RT.loadResourceScript("interop/core.clj");
        RT.var("interop.core", "print-string").invoke("hello world");
    }
}
