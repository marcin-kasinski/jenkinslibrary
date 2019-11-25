#!/usr/bin/env groovy

def call(String name = 'human') {
    println "Hello, ${name}."
    def test = "ABCDEFGHIJ"
    println name.substring(1)
    def number=2
    def number2=number+2
    println "number2=${number2}."

}
