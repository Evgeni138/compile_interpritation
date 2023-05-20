compil:
	javac -d out calc/run/Main.java
run:
	java -classpath ./out/calc/run Main
clear:
	rm -R out docs
makedocs:
	javadoc -sourcepath ./ -d docs -cp out -subpackages calc