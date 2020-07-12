# SpringBoot-Security-JPA

## Spring Security Architecture

![spring security arch diagram](https://user-images.githubusercontent.com/9671419/87248922-9e0d9a80-c479-11ea-9ca4-05f0f6d619c5.JPG)

## DataBase Details (MySQL)

- create database myspringsecurity;

- use myspringsecurity;

- create table user(
   id INT NOT NULL AUTO_INCREMENT,
   userName VARCHAR(100) NOT NULL,
   password VARCHAR(40) NOT NULL,
   active boolean NOT NULL,
   roles VARCHAR(40) NOT NULL,
   PRIMARY KEY ( id )
);

- INSERT INTO user (username, password, active, roles) values( 'user','pass',true,'ROLE_USER');

- select * from user;

## Application Property 

server.port=9090

spring.datasource.url=jdbc:mysql://localhost:3306/myspringsecurity

spring.datasource.username=root

spring.datasource.password =root123

spring.jpa.hibernate.ddl-auto=update

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.naming-strategy=org.hibernate.cfg.ImprovedNamingStrategy

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

## URL's :

login : user & password : pass

![j_1](https://user-images.githubusercontent.com/9671419/87248773-19228100-c479-11ea-8a3b-3eadf220a076.PNG)

![J_2](https://user-images.githubusercontent.com/9671419/87248774-19bb1780-c479-11ea-9e6f-0e4db09f2494.PNG)

![J_3](https://user-images.githubusercontent.com/9671419/87248775-1a53ae00-c479-11ea-8709-3c22b17ae863.PNG)




