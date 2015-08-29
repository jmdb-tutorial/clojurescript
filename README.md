# Clojurescript tutorial

This is to go with my intro to clojurescript talk.



# Hello World

This examples is just the basics, demonstrating raw clojurescript  https://github.com/clojure/clojurescript/wiki/Quick-Start

ALso this:

https://github.com/magomimmo/modern-cljs/blob/master/doc/tutorial-01.md

(require '[hello-world.core :as hello] :reload)


# OM

Om is a clojurescript interface to react.js

# Real world example

- Recording identity evidence on a loan application


(js/alert "I am an evil side-effect")

(require '[clojure.browser.dom :as dom])

(dom/append (dom/get-element "content") (dom/html->dom "<h1>ClojureScript is all up in your DOM.</h1>"))
