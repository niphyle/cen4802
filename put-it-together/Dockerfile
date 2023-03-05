FROM openjdk:11
WORKDIR /app
COPY /src/main/java/nphyle/App.java .
RUN javac App.java
ENTRYPOINT ["java", "App"]