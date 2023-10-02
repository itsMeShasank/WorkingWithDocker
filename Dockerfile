FROM openjdk:17-jdk

WORKDIR /app

COPY target/student-app.jar /app/student-app.jar

EXPOSE 8088

CMD ["java","-jar","student-app.jar"]