ARG JAVA_VERSION="8"

FROM openjdk:${JAVA_VERSION}

ARG SOME_ARG="Default_Value"

WORKDIR /app

COPY . /app

RUN echo "ARGS is ${SOME_ARG}"

RUN javac Main.java

ENTRYPOINT [ "java", "Main" ]
