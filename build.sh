cd grammar
make
cd -
make
cd lib
gcc -shared -fPIC -std=c99 library.c -o library.so
