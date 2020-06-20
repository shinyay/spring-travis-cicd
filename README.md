# Travis CI with Spring Boot

Continuous Integration / Continuous Delivery for Spring Boot

## Description

## Demo

### 1. Building Process in Travis CI

- `.travis.yml` is located at repository;s root

```yaml
language: java
jdk:
  - openjdk11
script:
  - ./gradlew clean build
```

### 2. Travis Settings

- [Travis Settings](https://travis-ci.com/github/shinyay/spring-travis-cicd/settings)

#### Environment Variables

- DOCKER_PASSWORD
- DOCKER_USERNAME

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
