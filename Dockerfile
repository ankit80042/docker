FROM 898334718399.dkr.ecr.us-east-1.amazonaws.com/aws-ecr:latest-build-test

WORKDIR /app

COPY . /app/

RUN javac Main.java

ENTRYPOINT [ "java", "Main" ]
