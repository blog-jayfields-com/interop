package interop;

import clojure.lang.RT;

public class Example {
    public static void main(String[] args) throws Exception {
        RT.loadResourceScript("interop/core.clj");
        System.out.println(RT.var("interop.core", "main").invoke());
    }
}
