(defn convert-to-set
    "Takes one or two values and returns them as a set"
    ([x] #{x})
    ([x y] #{x y}))

(println (convert-to-set 1))
(println (convert-to-set 1 2))
