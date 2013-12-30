default: bin/Compiler.class

src/MagicBaseVisitor: grammar/Magic.gr4
	java -jar lib/antlr-4.1-complete.jar grammar/Magic.g4 -o src/ -visitor

lib/libmagic.o: lib/libmagic.cpp
	g++ -fPIC lib/libmagic.cpp -c -o lib/libmagic.o

lib/libmagic.so: lib/libmagic.cpp
	g++ -shared -fPIC lib/libmagic.cpp -o lib/libmagic.so

lib: lib/libmagic.o lib/libmagic.so

bin/Compiler.class: src/*.java
	mkdir -p bin
	javac src/*.java -d bin/ -Xlint:unchecked lib
