#!/bin/sh


build () {
    echo $1
    echo
    rm -r out
    lein with-profile +$1 trampoline run -m clojure.main build.clj
}

build 1.9.946
# build 1.9.293
