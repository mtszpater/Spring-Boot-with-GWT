# Spring-Boot-with-GWT

build:
`
$ mvn clean package
`

run: 
`
$ java -jar target/demo.war
`


welcome page:
http://localhost:8080/Google_web_toolkit.html


debug mode:

first run ` $ mvn clean spring-boot:run` then in another window: `$ mvn gwt:devmode -Pgwt-dev`