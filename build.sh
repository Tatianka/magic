#!/bin/bash
cd grammar
make
cd -
make
cd lib
g++ -shared -fPIC libmagic.cpp -o libmagic.so
g++ -fPIC libmagic.cpp -c -o libmagic.o
