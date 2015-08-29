(defproject hello-figwheel "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "0.0-3308"]]
  :plugins [[lein-cljsbuild "1.0.5"]
            [lein-figwheel "0.3.7"]]
  :clean-targets [:target-path "out"]
  :cljsbuild {
              :builds [{:id "dev"
                        :source-paths ["src"]
                        :figwheel true
                        :compiler {:main hello-figwheel.core}
                        }]
              })
