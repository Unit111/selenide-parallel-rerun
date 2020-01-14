This is an example project demostrating a few concepts I wanted to see working together:
* JUnit 5
* Run tests in parallel
* Retry failed tests
* Do all this using Maven
* Use Selenide instead of regular Selenium

You can run the tests using this Maven command:
```clean install -Dsurefire.rerunFailingTestsCount=2```
