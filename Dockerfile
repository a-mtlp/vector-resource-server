FROM maven:3.8.4-openjdk-17 as builder
WORKDIR /app
COPY . /app
RUN mvn package

FROM openjdk:17-alpine
WORKDIR /app
EXPOSE 80
COPY --from=builder /app/target/*.jar /app/app.jar
CMD ["java","-jar","/app/app.jar"]