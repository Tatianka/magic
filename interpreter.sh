#!/bin/bash
java -cp ./bin:$CLASSPATH Compiler $1 > $1.ll
opt -S -std-compile-opts $1.ll > $1.opt.ll
lli -load=lib/libmagic.so $1.opt.ll
rm $1.ll $1.opt.ll
