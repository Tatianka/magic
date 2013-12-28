cd grammar
make
cd -
make
cd lib
g++ -shared -fPIC library.cpp -o libsimlang.so

