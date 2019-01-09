build:
	find src/main/java -name "*.java" | xargs javac
	find . -name "*.class" | xargs jar cfm app.jar Manifest.txt

run:
	java -jar app.jar
