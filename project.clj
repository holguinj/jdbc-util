(def ks-version "1.0.0")

(defproject puppetlabs/jdbc-util "0.3.1-SNAPSHOT"
  :description "Common JDBC helpers for use in Puppet Labs projects"
  :url "https://github.com/puppetlabs/jdbc-util"

  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}

  :pedantic? :abort
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/java.jdbc "0.3.2"]
                 [org.postgresql/postgresql "9.4.1208.jre7"]
                 [com.zaxxer/HikariCP "2.4.3"]
                 [puppetlabs/kitchensink ~ks-version]
                 [io.dropwizard.metrics/metrics-core "3.1.2"]
                 [io.dropwizard.metrics/metrics-healthchecks "3.1.2"]]

  :profiles {:dev {:dependencies [[org.slf4j/slf4j-api "1.7.21"]
                                  [org.slf4j/slf4j-log4j12 "1.7.21"]
                                  [log4j/log4j "1.2.17"]]}}

  :plugins [[lein-release "1.0.5"]]

  :lein-release {:scm :git
                 :deploy-via :lein-deploy}

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/clojars_jenkins_username
                                     :password :env/clojars_jenkins_password
                                     :sign-releases false}]])
