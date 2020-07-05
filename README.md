# rsvpApplication

# To start Zookeeper
C:\work\apache\zookeeper\apache-zookeeper-3.6.1-bin\bin>zkserver

# To start the kafka server
C:\work\apache\kafka\kafka_2.13-2.5.0\bin\windows>kafka-server-start.bat ..\..\config\server.properties

# To start a sample consumer on a topic
C:\work\apache\kafka\kafka_2.13-2.5.0\bin\windows>kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic meetupTopic --from-beginning
 
