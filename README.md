# BJSS Programming Test

End-to-end Behaviour Testing of a PrestaShop Fashion Store

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

* Java 8
* Maven
* Chrome

### Installing

```
mvn clean install
```

## Running the tests

```
mvn verify
```

## Reports

Once the tests have ran Serenity will generate a report which can be found at path:

```
target/site/index.html
```

## Bugs

### Assertion of correct added Order message

The Order History Item page has a number of tables which would meet a CSS selector. The requirement is to select the h3.page-heading
which contains 'Messages' with the next sibling table being the order messages. The first td element of the table rows are the date/time of the message
with the second td being the message content.

The required action is to fix the [XPath](https://www.w3.org/TR/1999/REC-xpath-19991116/) defined in ```OrderHistoryItem.MESSAGE_BODY``` which 
enables the Question ```OrderMessages``` to return Question<<List<String>> for the assertion to function correctly.

## Limitations

* ```OrderReview``` uses hardcoded user credentials where if the test site data were cleared the tests would provide a false failure. The fix 
would be to create atomic tests which can create the Preconditions required to successfully execute the Test Cases.
* ```BuyProduct``` uses hard-coded constants for data. A better approach would be to implement a DataProvider to allow the execution
 of tests with various data (ie. different state to test shipping rules). A DAO would remove the need for passing in many parameters through 
 the object constructor to allow for greater flexibility while refactoring. Using a library such as [FreeBuilder](https://github.com/inferred/FreeBuilder) 
 and Java Optionals to enable partial data subjects would allow for greater flexibility in providing data for the tests.
 * Timeout strategies are required for instances where the iframed model loads slower than expected. Using a [Retryer](https://github.com/rholder/guava-retrying) 
 could reduce the britle nature of tests failing due to performance issues where test cases can use an exponential back off strategy to 
 allow the application additional time during these slowdowns.

## Future Improvements

* Using Google Freebuilder to create DAO which could be used to create data for the Personal and Address information during checkout
* Using the above DAO, refactor ```tasks.checkout.FillPersonalDetails``` and ```tasks.checkout.FillAddressDetails``` to pass in the DAO instead of a length number of parameters
* Use Joda Money to assert all monetary instances rather than assertion against String literals
* Use DataTable to add and assert Shopping Cart totals rather than hard coding the products and prices
* Add Utility to parse colour/size from Shopping Cart summary product description
* Refactor product selection to, potentially, use product code as a more reliable way of identifying products rather than product names

## Built With

* [maven](https://nodejs.org/en/) - Maven Dependency Management
* [Serenity BDD](http://www.thucydides.info) - Serenity BDD
* [Selenium](https://www.seleniumhq.org/) - Selenium Web Driver
* [Hamcrest](http://hamcrest.org/JavaHamcrest/) - Java Matcher Assertions

## Contributing

Please read [CONTRIBUTING.md](https://github.com/WillBro/lets-go-shopping-automation/blob/master/CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/WillBro/lets-go-shopping-automation/tags).

## Authors

* **William Brown** - *Initial work* - [WillBro](https://github.com/WillBro)

See also the list of [contributors](https://github.com/WillBro/lets-go-shopping-automation/contributors) who participated in this project.

## License

See [LICENSE](https://github.com/WillBro/lets-go-shopping-automation/LICENSE.md)

## Acknowledgments

* [John Ferguson Smart](https://johnfergusonsmart.com/) - For his testing knowledge and Serenity Lessons
* [Baeldung](http://www.baeldung.com/) - Awesome Java tutorials
