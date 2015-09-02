all: compile

compile:
	java -cp cljs.jar:src clojure.main build.clj

release:
	java -cp cljs.jar:src clojure.main release.clj

clean:
	rm -rf out

browse:
	open index.html	
