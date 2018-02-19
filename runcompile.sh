#!/bin/bash
javac -d bin -sourcepath src/  src/**/*.java
java -classpath bin/ library.Application $@
