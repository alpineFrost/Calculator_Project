FROM openjdk:11
COPY ./target/SPE-Mini-Project-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "SPE-Mini-Project-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calculator"]
