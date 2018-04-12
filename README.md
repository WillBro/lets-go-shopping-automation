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

## Remaining Assignment Tasks

At present there are remaining assignment tasks:

* Assertion of correct added Order message
* Testing of the REST API CRUD operations of https://reqres.in/

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
