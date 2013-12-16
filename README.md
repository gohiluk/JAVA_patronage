Kompilacja w folderze z pom.xml za pomocą komendy
<pre>mvn package</pre>

następnie uruchomienie aplikacji na serwerze za pomocą komendy
<pre>mvn tomcat7:run</pre>

po wpisaniu url 
<pre>http://localhost:8080/api/hello?person=Willson</pre>
otrzymujemy odpowiedź
<pre>{"message":"Hello, Willson!"}</pre>
