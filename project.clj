(defproject techascent/tech.javacpp-datatype "3.3-SNAPSHOT"
  :description "Bindings between javacpp and tech.datatype"
  :url "http://github.com/tech-ascent/tech.javacpp-datatype"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-tools-deps "0.4.1"]]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :lein-tools-deps/config {:config-files [:install :user :project]}
  :profiles {:dev {:lein-tools-deps/config {:resolve-aliases [:test]}}})
