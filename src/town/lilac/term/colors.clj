(ns town.lilac.term.colors
  (:require
    [clojure.string]))


;; Bind to true to have the colorize functions not apply coloring to
;; their arguments.
(def ^:dynamic *disable-colors* nil)


(defn grey
  [& args]
  (if-not *disable-colors*
    (str (clojure.string/join
          (map
           (fn* [p1__7898__7899__auto__]
                (str "[30m" p1__7898__7899__auto__)) args))
         "[0m")
    (apply str args)))


(defn red
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[31m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn green
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[32m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn yellow
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[33m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn blue
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[34m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn magenta
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[35m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn cyan
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[36m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn white
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[37m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn on-grey
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[40m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn on-red
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[41m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn on-green
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[42m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn on-yellow
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[43m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn on-blue
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[44m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn on-magenta
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[45m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn on-cyan
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[46m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn on-white
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[47m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn bold
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[1m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn dark
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[2m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn underline
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[4m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn blink
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[5m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn reverse-color
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[7m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))


(defn concealed
  [& args]
  (if-not *disable-colors* (str (clojure.string/join (map (fn* [p1__7898__7899__auto__] (str "[8m" p1__7898__7899__auto__)) args)) "[0m") (apply str args)))
