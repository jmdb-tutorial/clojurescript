# Clojurescript tutorial

This is to go with my intro to clojurescript talk.



# Hello World

This examples is just the basics, demonstrating raw clojurescript  https://github.com/clojure/clojurescript/wiki/Quick-Start

ALso this:

https://github.com/magomimmo/modern-cljs/blob/master/doc/tutorial-01.md



# OM

Om is a clojurescript interface to react.js

# Real world example

- Recording identity evidence on a loan application

(enable-console-print!)

(println "hello world from the repl!")

(js/alert "Hello World!")

(require '[clojure.browser.dom :as dom])

(dom/append (dom/get-element "content") (dom/html->dom "<h1>ClojureScript Rocks!</h1>"))


(require '[hello-world.core :as hello] :reload)

(hello/foo 3 4)

hello_figwheel.core.foo(2, 3);

;; Then can change the code and reload using

(require '[hello-world.core :as hello] :reload)

## Figwheel

https://github.com/bhauman/lein-figwheel/wiki/Quick-Start

http://blog.jonharrington.org/clojurescript-and-closure-ui/

https://github.com/clojure/clojurescript/wiki/The-REPL-and-Evaluation-Environments

https://github.com/bhauman/lein-figwheel/wiki/Quick-Start

