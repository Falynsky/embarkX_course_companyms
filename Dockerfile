FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/companyms-0.0.1-SNAPSHOT.jar companyms-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "companyms-0.0.1-SNAPSHOT.jar"]