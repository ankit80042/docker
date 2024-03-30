FROM openjdk:8

ARG SOME_ARG="Default_Value"
ARG SOME_ARG_2="Default_Value_2"

WORKDIR /app/test

COPY . /app/test

RUN echo "ARGS is ${SOME_ARG}"
RUN echo "ARGS is ${SOME_ARG_2}"

RUN javac Main.java

ENTRYPOINT [ "java", "Main" ]
