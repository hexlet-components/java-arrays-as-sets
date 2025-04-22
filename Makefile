build:
	./gradlew clean build

lint:
	./gradlew checkstyleMain checkstyleTest

test:
	./gradlew test
