#!/bin/sh


run () {
    echo $1
    echo
    rm -r out
    lein with-profile +$1 trampoline run -m clojure.main build.clj
}

run 1.9.946
run 1.9.293
