# Clojurescript tutorial

This is to go with my intro to clojurescript talk.



# Hello World

This examples is just the basics, demonstrating raw clojurescript  https://github.com/clojure/clojurescript/wiki/Quick-Start

Also this:

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

https://github.com/omcljs/om/wiki/Basic-Tutorial

Add the facebook react dev tools:

http://fb.me/react-devtools

https://facebook.github.io/react/

(in-ns 'hello-om.core)

run lein figwheel to run the example and then hit localhost:3449


https://facebook.github.io/react/
# Where clojurescript support was added in chrome:
https://code.google.com/p/chromium/issues/detail?id=312271


Cursors in clojurescript:

https://github.com/omcljs/om/wiki/Cursors#user-content-accessing-cursors

Outside of the render phase, you cannot treat cursors as values. Instead, you need to deref it (@) and work with the value returned. Deref returns the actual value beneath the cursor: a map or a vector.
