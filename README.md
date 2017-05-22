# Sample project for [swagger-gradle-plugin](https://github.com/slamdev/swagger-gradle-plugin)

Important pars are:
* `/producer/build/generated-sources/main/` - java classes generated for producer module from swagger specifications
* `/producer/build/generated-sources/merged.yml` - how yaml specs are merged into a single one
* `/producer/build/client-api/sources/` - java classes generated for consumer module from swagger specifications
* `/producer/src/main/resources/rest-api/` - swagger specifications
* `/producer/src/main/java/com/github/slamdev/producer/ApiProcessor.java` - implementation of producer api
* `/consumer/src/main/java/com/github/slamdev/consumer/SampleService.java` - calls to producer via consumer library
* `/consumer/src/main/resources/application.properties` - url to producer api
