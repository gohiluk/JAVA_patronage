%%%%%%%%%%%%%%  zadanie_2 %%%%%%%%%%%%%
Kompilacja w folderze z pom.xml za pomocą komendy
mvn package

następnie uruchomienie aplikacji na serwerze za pomocą komendy
mvn tomcat7:run

po wpisaniu url http://localhost:8080/api/hello?person=Willson
otrzymujemy odpowiedź
{"message":"Hello, Willson!"}







%%%%%%%%%%%%%%  zadanie_1 %%%%%%%%%%%%%

Aby skompilować aplikację należy w lini komend przejsc do folderu Tomasz.Nosal (tam gdzie znajduje się pom.xml) i wywołać komende:
mvn package

Aby uruchomić aplikację:
java -cp target/Tomasz.Nosal-1.0-SNAPSHOT.jar com.myproject.app.App
