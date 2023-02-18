# Factory Pattern

### Factory Method Pattern: defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory method lets Class defer instantiation to subclasses.

- There are two sets of classes
  - Creators, these are the abstract classes which contain all the operations but also has an abstract factory method to delegate the instantiation of Concrete Products to its subclasses. These subclasses which provide the implementation for the factory method are the concrete creator classes and contains the logic of instantiation.
  - Products, these are classes for which instances have to be created. These usually are the abstract classes and concrete implementations for these are created by concrete creators during runtime. All products must implement the same interface so that the classes that use the products can refer to the interface not the concrete class.

### Abstract Factory Pattern: 