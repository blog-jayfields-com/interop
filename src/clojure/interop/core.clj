(ns interop.core)

(defn print-string [arg]
  (println arg "is" (.length arg) "characters long"))
