FROM openjdk:8

WORKDIR /app/test

COPY . /app/test

RUN javac Main.java

ENTRYPOINT [ "java", "Main" ]
