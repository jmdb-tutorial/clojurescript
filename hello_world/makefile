all: compile

compile:
	java -cp cljs.jar:src clojure.main build.clj

autobuild:
	java -cp cljs.jar:src clojure.main watch.clj

repl:
	rlwrap java -cp cljs.jar:src clojure.main repl.clj

release:
	java -cp cljs.jar:src clojure.main release.clj

clean:
	rm -rf out

browse:
	open index.html	
