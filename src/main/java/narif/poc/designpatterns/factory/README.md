# Factory Pattern

### Factory Method Pattern: defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory method lets Class defer instantiation to subclasses.

- There are two sets of classes
  - Creators, these are the abstract classes which contain all the operations but also has an abstract factory method to delegate the instantiation of Concrete Products to its subclasses. These subclasses which provide the implementation for the factory method are the concrete creator classes and contains the logic of instantiation.
  - Products, these are classes for which instances have to be created. These usually are the abstract classes and concrete implementations for these are created by concrete creators during runtime. All products must implement the same interface so that the classes that use the products can refer to the interface not the concrete class.

### Abstract Factory Pattern: provides an interface for creating families of related or dependent objects without specifying their concrete classes.

- Here instead of directly defining the factory method inside the creator, an interface is created. This interface contains different Factory Methods to create families of related objects.
- Then concrete implementations for this interface is provided and these implementations of the Factory Methods present in this interface follows the Factory Method Pattern. 
- The client is written against the Abstract Factory interface and then composed with concrete implementation at runtime. Client then delegates the instantiation to one of the methods of Abstract Factory interface.

### Design Principle:

- Dependency Inversion Principle: Depend upon abstractions. Do not depend upon concrete classes.
  - Our higher-level components should not depend on our lower-level components; rather they should both depend on abstractions.
  - For example, If we have a class, A, that instantiates a concrete class, B, directly, then higher-level component(A) is directly dependent on lower-level component(B).
    - If we apply dependency inversion principle, then we first need to make sure that our lower-level component should be dependent on an abstraction and the higher-level component should also be dependent on an abstraction.
    - In order to achieve this we need AbstractB component and then our lower-level component, B, should extend it.
    - Now our higher-level component A should be composed of AbstractB instead of directly instantiating B.
    - This inverts the dependency graph.

### Notes:

- All factories encapsulate object creation.
- Simple Factory, while not a bona fide design pattern, is a simple way to decouple clients from concrete classes.
- Factory Method relies on inheritance: object creation is delegated to subclasses which implement the factory method to create objects.
  - The intent of Factory Method is to allow classes to defer instantiation to its subclasses.
- Abstract Factory relies on object composition: object creation is implemented in the methods exposed by the factory interface.
  - The intent of Abstract Factory is to create families of related objects without having to depend on their concrete classes.
- All factory patterns promote loose coupling by reducing the dependency of your application on concrete classes.