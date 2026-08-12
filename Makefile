build:
	./gradlew clean build

lint:
	./gradlew spotlessCheck

lint-fix:
	./gradlew spotlessApply

test:
	./gradlew test
