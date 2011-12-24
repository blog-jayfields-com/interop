(ns interop.core)

(defn print-string [arg]
  ;;; calling a static method
  (println (String/valueOf true))

  ;;; using an enum
  (println (java.util.concurrent.TimeUnit/SECONDS))

  ;;; using a Java nested (inner) class. Note, in Clojure you
  ;;; use a $ instead of a .
  (println (java.util.AbstractMap$SimpleEntry. "key" "val")))
