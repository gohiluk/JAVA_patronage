Kompilacja w folderze z pom.xml za pomocą komendy
mvn package

następnie uruchomienie aplikacji na serwerze za pomocą komendy
mvn tomcat7:run

po wpisaniu url http://localhost:8080/api/hello?person=Willson
otrzymujemy odpowiedź
{"message":"Hello, Willson!"}
