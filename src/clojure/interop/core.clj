(ns interop.core)

(defn print-string [arg]
  ;;; pass a Clojure vector where Java expects a java.util.Collection
  (println (java.util.HashSet. ["1" "2"]))

  ;;; pass a Clojure map where Java expects a java.util.Map
  (println (java.util.LinkedHashMap. {1 "1" 2 "2"}))

  ;;; pass a Clojure function where Java expects a Runnable
  (println (Thread. (fn [] (println "clojure fns are runnables (and callables)")))))
