# Hibernate Extension

## Builds

We use gradle for build automation. You do *not* need to install gradle to build/develop/test the extension.

* `./gradlew test` - run tests
* `./gradlew build` - Runs tests, builds docs and a new extension version.

## TODO:

Unfortunately, we'll need to rewrite the lucee script runner for Gradle to make tests work:

> https://github.com/lucee/script-runner