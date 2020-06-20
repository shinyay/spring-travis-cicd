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

### 2. Jib plugin to build Container

- Add Jib Plugin

```kotlin
plugins {
	id("com.google.cloud.tools.jib") version "2.4.0"
}
```

- Add Jib Configuration

```kotlin
jib {
	from {
		image = "openjdk:11-slim"
	}
	to {
		image = "registry.hub.docker.com/shinyay/${project.name}"
		tags = setOf("latest", "${project.version}")
	}
	container {
		creationTime = "USE_CURRENT_TIMESTAMP"
	}
}
```

### 3. Container Building Process in Travis CI

```yaml
language: java
jdk:
  - openjdk11
services:
  - docker

before_install:
  - echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin

script:
  - ./gradlew clean build
  - ./gradlew jib
```

### 4. Travis Settings for Docker Credential

- [Travis Settings](https://travis-ci.com/github/shinyay/spring-travis-cicd/settings)

#### Environment Variables

- `DOCKER_USERNAME`
- `DOCKER_PASSWORD`

![Environment Variables](images/travis-env-value.png)

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
