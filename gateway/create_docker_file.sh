#!/bin/sh

container=$1

./mvnw clean package
mkdir target/dependency
cd target/dependency
jar -xvf ../*.jar
cd ../..
docker build -t $container .
