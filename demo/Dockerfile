FROM java:8
VOLUME /tmp
ADD target/demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 5000
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]
