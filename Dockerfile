FROM bellsoft/liberica-openjre-alpine:21

WORKDIR /app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

RUN ./mvnw dependency:go-offline

COPY src src

RUN ./mvnw package -DskipTests

VOLUME /tmp

COPY ./target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "/app.jar"]