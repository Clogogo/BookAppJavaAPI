FROM openjdk:11
ADD target/login-properties-mysql.jar login-properties-mysql.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar","login-properties-mysql"]