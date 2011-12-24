(ns interop.core)

(defn print-string [arg]
  (println (.replace arg "hello" "goodbye")))
