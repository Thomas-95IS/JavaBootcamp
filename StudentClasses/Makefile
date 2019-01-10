build:
	find src/main/java -name "*.java" | xargs javac -classpath lib/*.jar
	find . -name "*.class" | xargs jar cfm app.jar Manifest.txt

run:
	# java -jar app.jar
	java -cp lib/gson-2.6.2.jar:app.jar src.main.java.Main
