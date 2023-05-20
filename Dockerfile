FROM bellsoft/liberica-openjdk-alpine:latest
COPY ./ ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out src/calc/run/Main.java
CMD java -classpath ./out calc.run.Main