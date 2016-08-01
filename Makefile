compile:
	mvn clean compile package

all-test:
	mvn clean compile test

test:
	mvn -Dtest=$(case) test

clean:
	mvn clean
