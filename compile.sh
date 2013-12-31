#!/bin/bash
if [ -L $0 ] ; then
    DIR=$(dirname $(readlink -f $0)) ;
else
    DIR=$(dirname $0) ;
fi ;

echo "Compiling $1 into $2"

java -cp $DIR/bin:$CLASSPATH Compiler $1 > $1.ll && \
opt -S -std-compile-opts $1.ll > $1.opt.ll && \
llc $1.opt.ll -o $1.s && \
g++ $DIR/lib/libmagic.o $1.s -o $2

rm $1.s
rm $1.ll
rm $1.opt.ll
