FROM openjdk:8-jre-alpine
ADD target/ /opt/
WORKDIR /opt
EXPOSE 8181
ENTRYPOINT exec java $JAVA_OPTS -jar kafka-producer.jar
