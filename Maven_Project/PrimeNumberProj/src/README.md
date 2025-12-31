mvn archetype:generate -DgroupId=com.su2 -DartifactId=PrimeNumberProj -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

mvn clean package

mvn exec:java -Dexec.mainClass=com.su2.App