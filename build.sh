#! /bin/bash

javac *.java -d bin/
java -cp bin/ Main $@
