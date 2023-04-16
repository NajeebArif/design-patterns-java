# Facade Pattern

### Facade Pattern: provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

### Design Principles

- **Principle of the Least Knowledge** (Law of Demeter): talk only to your immediate friends. 
  - The principle provides some guidelines: take any object, and from any method in that object, invoke only methods that belong to:
    - The object itself
    - Objects passed in as a parameter to the method
    - Any object the method creates or instantiates.
    - Any components of the object.
  - The first three guidelines tell us not to call methods on objects that were returned from calling other methods. For the fourth point, think of a "component" as any object that is referenced by an instance variable. In other words, think of this as a HAS-A relationship. 
  - Example code sample:
    - Without the principle:
      - ```java 
        public float getTemp(){
          Thermometer thermometer = station.getThermometer();
          return thermometer.getTemperature();
        }
        ```
      - here we get the thermometer object from the station and then call the getTemperature() method ourselves.
    - With the Principle:
      - ```java
        public float getTemp(){
          return station.getTemperature();
        }
        ```
      - when we apply the principle, we add a method to the station class that makes a request to the thermometer for us. This reduces the number of classes we are dependent on.
  - Disadvantage of Law of Demeter or Principle of Least Knowledge:
    - While the principle reduces the dependencies between objects and studies have that this reduces software maintenance, it is also the case that applying this principle results in more wrapper classes being written to handle method calls to ther components.
    - This can result in increased complexity and development time as well as decreased runtime performance. 



### Notes:

- When you need to simplify and unify a large interface or a complex set of interfaces, use a facade.
- A facade decouples a client from a complex subsystem. Therefore, anything in the subsystem changes, the client will not be affected by it.
- Implementing a facade requires that we compose the facade with its subsystem and use delegation to perform the work of the facade.
- You can implement more than one facade for a subsystem.
- _Facade and adapter may wrap multiple classes but a facade's **intent** is to simplify, while an adapter's intent is to convert the interface to something different._
- _Facade don't encapsulate the subsystems classes; they merely provide a simplified interface to their functionality._ Clients are still free and capable to call any method of the subsystem to provide some advanced functionality.

