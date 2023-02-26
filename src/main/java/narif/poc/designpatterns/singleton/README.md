# Singleton Pattern

### Singleton Pattern - Ensure a class only has one instance and provide a global point of access to it.

### Notes;

- The singleton pattern ensures you have at most one instance of a class in  your application.
- The singleton pattern also provides a global access point to that instance.
- Java's implementation of the Singleton Pattern makes use of a private constructor, a static method combined with a static variable.
- Examine your performance and resource constraints and carefully choose an appropriate singleton implementation for multithreaded applications(and we should consider all applications multithreaded).
- Beware of double-checked locking implementation, it is not thread safe in versions before Java 5(no volatile keyword).
- Be careful when you are using multiple classloaders, this could defeat singleton implementation and result in multiple instances.
- You can use Java's enums to simplify your singleton implementation.
- If the performance of the getInstance is not critical then just go with the SlowSingleton implementation, i.e. synchronize the getInstance method. Synchronizing getInstance() is straightforward and effective. 
- Move to an eagerly created instance rather than a lazily created one. If teh application always creates and uses an instance of Singleton, or the overhead of creation and runtime aspects of the Singleton is not onerous, you may want to create your singleton eagerly. Creating an instance of Singleton in a static initializer is guaranteed to be thread safe. 