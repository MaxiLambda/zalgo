(ns zalgo.main
    (:require [zalgo.core :refer [toZalgo]]))

(defn -main [input file] (toZalgo input file))