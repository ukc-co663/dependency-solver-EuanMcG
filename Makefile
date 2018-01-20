# Will install java, maven and then build the program, it will then run the program through all the tests
#!/usr/bin/env bash
all:
		#####Starting to install dependencies#####
		-apt-get update -y
		-apt-get install default-jdk -y
		-apt-get install maven -y
		#####Dependencies have been installed#####
		#####Building project with Maven#####
		mvn install
		cd target/ && java -jar depsolver-1.0-SNAPSHOT.jar test.txt;ls;
