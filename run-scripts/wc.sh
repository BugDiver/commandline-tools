rm -rf out/*
javac -cp "src" -d out src/client/WCClient.java
java -cp "out" client.WCClient $@

