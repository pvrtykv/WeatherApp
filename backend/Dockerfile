FROM openjdk:17-jdk-slim-buster

COPY ./ /app

WORKDIR /app
RUN ./gradlew bootJar
RUN cp build/libs/weather.jar /entrypoint.jar

WORKDIR /
RUN rm -rf /app /root/.gradle

CMD ["java", "-jar", "entrypoint.jar"]