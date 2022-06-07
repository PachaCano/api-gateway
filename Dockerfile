FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} api-gateway.jar
EXPOSE 8443
ENTRYPOINT ["java", "-jar", "/api-gateway.jar"]
