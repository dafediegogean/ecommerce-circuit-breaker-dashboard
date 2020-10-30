FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ecommerce-circuit-breaker-dashboard.jar
ENTRYPOINT ["java","-jar","/ecommerce-circuit-breaker-dashboard.jar"]

