default: bin/Compiler.class

class: src/*.java
	javac src/*.java -d bin/ -Xlint:unchecked

bin/Main.class: class

bin/Compiler.class: class
