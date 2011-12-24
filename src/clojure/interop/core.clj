(ns interop.core)

(defn proxy-coll []
  (proxy [java.util.Collection] []
    (add [o]
         (println o)
         true)))

(defn reify-coll []
  (reify java.util.Collection
    (add [this o]
         (println o)
         (println this)
         true)))

(defn main []
  (.add (proxy-coll) "this string is printed on proxied.add")
  (.add (reify-coll) "this string is printed on reified.add"))
