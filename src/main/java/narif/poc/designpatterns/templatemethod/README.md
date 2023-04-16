# Template Method Pattern
###### Encapsulating Algorithms

----

### Template Method Pattern: defines the skeleton of an algorithm in a method, deferring some steps to subclass. Template method lets subclass redefine certain steps of an algorithm without changing the algorithm's structure. 

### Notes:
- When we have got code duplication, that's a good sign we need to clean up the design.
- The template method defines the steps of an algorithm and allows subclass to provide the implementation for one or more steps.
- 