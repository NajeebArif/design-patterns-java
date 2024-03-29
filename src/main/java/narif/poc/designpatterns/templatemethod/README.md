# Template Method Pattern
###### Encapsulating Algorithms

----

### Template Method Pattern: defines the skeleton of an algorithm in a method, deferring some steps to subclass. Template method lets subclass redefine certain steps of an algorithm without changing the algorithm's structure. 

### Design principle:
- The Hollywood Principle: Don't call us, we'll call you.
  - Low level components can participate in a computation but the high level components control when and how.
  - A low level component never calls a high level component directly.
  - The Hollywood Principle and Template Method:
    - In the code example, CaffeineBeverage is our high level component. It has control over the algorithm for the recipe, and calls on the subclass only when they are needed for an implementation of a method.
    - Clients of beverages will depend on the CaffeineBeverage abstraction rather than a concrete Tea or coffee, which reduces dependencies in the overall system
    - The subclasses are used to simply to provide implementation details.
    - Tea and coffee never call the abstract class directly without being "called" first.
  - Apart from Template method, Factory Method and Observer pattern follow this principle.

### Notes:
- When we have got code duplication, that's a good sign we need to clean up the design.
- The template method defines the steps of an algorithm and allows subclass to provide the implementation for one or more steps.
- The template method pattern gives us important technique for code reuse.
- The template methods abstract class may define concrete methods, abstract methods, and hooks.
- Abstract methods are implemented by subclass.
- Hooks are methods that do nothing or default behavior in the abstract class, but mau be overridden in the abstract class.
- To prevent the subclass from changing the algorithm in the template method, declare the template method as final.
- The Hollywood principle guides us to put decision making in high level modules that can decide how and when to call low-level modules.
- You'll see lots of uses of the template method pattern in real-world code, but(as with any pattern) don't expect it all to be designed "by the book".
- The Strategy and Template Method Patterns both encapsulate algorithms, the first by composition and the other by inheritance.
- Factory Method is a specialization of Template Method.
- Use cases for hooks:
  - a hook may provide a way for a subclass to implement an optional part of an algorithm, or if it is not important for the subclass's implementation.
  - give subclass a chance to react to some step in the template method that is about to happen or just happened.
- Keep abstract methods small in numbers, otherwise it will be a bog job to implement them in subclass.
- Real world examples: 
  - Using comparators to sort do the sorting
    - Implement the `Comparable` interface
    - Override the `compareTo()` method
    - In `compareTo()` return -1 if this is less than the passed object 
    - or return 1 if this is greater than the target object 
    - or return 0 if both are equal
    - Send the arrays of elements to Arrays.sort() to sort them, this internally uses `java.util.DualPivotQuickSort.sort()`.
  - This implementation of sorting may look like an implementation of strategy pattern but it is not.
    - You're probably thinking that because Strategy pattern uses object composition. You're right in a way - we are using Arrays object to sort our array, so that's similar to Strategy. But remember, in Strategy, the class you compose with _implements the entire algorithm_. The algorithm that Arrays implements for `sort()` is incomplete; it needs a class to fill in the missing `compareTo()` method. So, in that way, it is more like Template Method.
  - Other example in java library is `java.io` has `read()` method in `InputStream` that subclasses must implement and is used by template method `read(byte b[], int off, int len)`.
  - Custom Lists with `AbstractList`

---

| Pattern | What it does |
| ---|---|
|Template Method| Subclasses decide how to implement steps in an algorithm|
| Strategy| Encapsulates interchangeable behaviors and use delegation to decide which behavior to use|
|Factory Method| Subclasses decide which concrete classes to instantiate|
