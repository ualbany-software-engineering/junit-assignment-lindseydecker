
## Sample Project for JUnit Assignment.
## Deadline : May 5, 2019 23:59

The Repository contains a maven project with queue extended from [Princeton's Intro to programming](https://introcs.cs.princeton.edu/java/43stack/) sample.
The "enqueue" method has a bug : The developer has forgot to throw an exception when the queue is full.

#### Instructions to run

To Run tests and generate coverage reports :

> mvn jacoco:prepare-agent test jacoco:report

* Location of reports : *target/site/index.html*
* [Screenshot of a sample report](https://github.com/ninadpchaudhari/JUnit-Assignment/blob/master/jacoco-report-sample.png?raw=true) 

#### Requirements for assignment

* Have 100% instruction & branch coverage for both constructors, enqueue, dequeue, peek, length, isEmpty, removeAll for Queue Class
* Order of test execution cannot be manually set. Tests can be run indepedenly of each other.
* Annotations of JUnit are to be used.
* You should have atleast 1 failing test which reveals the bug in the enqueue method disclosed earlier.

#### Instructions for submission

* This repo should already exist as a base code in your particular Github Classroom repositories, push your changes to your respective repositories.
* Submit a compressed file of the entire project which contain the reports already generated.

#### References
* [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide)
* [JUnit 5 Samples](https://github.com/junit-team/junit5-samples)
* [JUnit 5 tests for *Stack*](https://github.com/junit-team/junit5/blob/master/documentation/src/test/java/example/TestingAStackDemo.java)
