 #Docker image for springboot application
# VERSION 0.0.1
# Author: bolingcavalry

### 基础镜像，使用alpine操作系统，openjkd使用8u201
FROM openjdk:8u201-jdk-alpine3.9
MAINTAINER zhangyingzheng@meituan.com
ENV  LANG=C.UTF-8 LC_ALL=C.UTF-8
VOLUME /data
ADD target/demo-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]
EXPOSE 8080
