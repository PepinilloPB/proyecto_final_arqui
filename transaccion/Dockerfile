FROM azul/zulu-openjdk:11.0.10

RUN apt update
RUN mkdir -p /opt/arquitectura/logs

VOLUME /opt/arquitectura/logs

ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

ENV SERVER_PORT 8002
ENV EUREKA_URI "http://localhost:8761/eureka"
ENV DB_URI "jdbc:mysql://localhost:3306/banco"
ENV CONFIG_URI "http://localhost:8888"
#ENV DB_HOST "localhost"
#ENV DB_PORT 3306
#ENV DATABASE "banco"

ENTRYPOINT [ "java", \
             "-cp",     \
             "app:app/lib/*",   \
             "com.example.demo.DemoApplication"]