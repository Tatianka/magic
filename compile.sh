#!/bin/bash
java -cp ./bin:$CLASSPATH Compiler $1 > $1.ll
opt -S -std-compile-opts $1.ll > $1.opt.ll
llc $1.opt.ll -o $1.s
g++ ./lib/libmagic.o $1.s -o $2
rm $1.s $1.ll $1.opt.ll
