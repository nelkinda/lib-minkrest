# lib-minkrestA

[![GitHub CI/CD](https://github.com/nelkinda/lib-minkrest/workflows/CI/CD/badge.svg)](https://github.com/nelkinda/template-multi-gradle/actions)

Minimalistic lambda-based hamcrest-style matcher in Kotlin, also works for Java.
Without the overhead of creating separate matchers.

## Reports
The reports are available locally, after running a build using `make`

### `lib-minkrest`
* [Checkstyle Report Main](lib-minkrest/build/reports/checkstyle/checkstyleMain/report.html)
* [Checkstyle Report Test](lib-minkrest/build/reports/checkstyle/checkstyleTest/report.html)
* [PMD Report Main](lib-minkrest/build/reports/pmd/pmdMain/report.html)
* [PMD Report Test](lib-minkrest/build/reports/pmd/pmdTest/report.html)
* [SonarLint Report Main](lib-minkrest/build/reports/sonarlint/sonarlintMain/report.html)
* [SonarLint Report Test](lib-minkrest/build/reports/sonarlint/sonarlintTest/report.html)
* [Test Report](lib-minkrest/build/reports/tests/test/index.html)
* [Jacoco Test Coverage Report](lib-minkrest/build/reports/jacoco/test/html/index.html)
* [PiTest Mutation Test Report](lib-minkrest/build/reports/pitest/index.html)
* [SonarQube](http://localhost:9000/dashboard?id=pubminkrest%3Alib-minkrest)
  (Requires SonarQube to be started with `make sonard` and analysis to be performed with `make sonarqube`)
