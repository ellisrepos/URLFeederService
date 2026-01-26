FROM eclipse-temurin:17
ADD target/URLFeederService.jar URLFeederService.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/URLFeederService.jar"]
