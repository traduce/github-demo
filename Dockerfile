From openjdk:17
ExPOSE 8080
ADD target/springboot-images-new.jar
ENTRYPOINT ["java","-jar","/springboot-images-new.jar"]