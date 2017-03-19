# spring-boot-starter-swagger2
spring-boot-starter-swagger2 used to auto-configure swagger2 in spring boot project

## quick-start

add below dependencies to your pom
```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-swagger2</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>
```
add configuration to your application.yml
```yaml
auto:
  swagger2:
    env: qa, uat
    host: http://localhost:8080
    enable: true
    basePackage: com
    path:
        - /hello
        - /helloworld
    apiInfo:
      version: 2.0
      title: test
      description: haha
      termsOfServiceUrl: url:test
      contact:
        name: heihei
        url: url:test
        email: xxx@xxx.com
```

## enjoy