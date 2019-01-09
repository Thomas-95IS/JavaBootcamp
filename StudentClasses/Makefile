build:
	javac student/javalang/*.java
	find . -name "*.class" | xargs jar cfm app.jar Manifest.txt

run:
	java -jar app.jar
