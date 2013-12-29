#!/bin/bash
java -cp ./bin:$CLASSPATH Compiler $1 #| opt -S -std-compile-opts
