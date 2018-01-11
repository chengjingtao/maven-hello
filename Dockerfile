FROM java:8-jdk-alpine
COPY ./target/maven-hello-1.0-SNAPSHOT.jar /
COPY entrypoint.sh /
RUN chmod +x entrypoint.sh
ENTRYPOINT [ "/entrypoint.sh"  ]
