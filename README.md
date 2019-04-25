
## Sample Project for JUnit Assignment.

The Repository contains a maven project with queue extended from [Princeton's Intro to programming](https://introcs.cs.princeton.edu/java/43stack/) sample.
The "enqueue" method has a bug : The developer has forgot to throw an exception when the queue is full.

##### Instructions to run

To Run tests and generate coverage reports :

> mvn jacoco:prepare-agent test jacoco:report

Location of reports : *target/site/index.html*

##### Instructions for assignment

* Have 100% instruction & branch coverage for both constructors, enqueue, dequeue, peek, length, isEmpty, removeAll for Queue Class
* Order of test execution cannot be manually set. Tests can be run indepedenly of each other.
* Annotations of JUnit are to be used.
* You should have atleast 1 failing test which reveals the bug in the enqueue method disclosed earlier.
