# Facade Pattern

### Facade Pattern: provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
### Design Principles
- Principle of the Least Knowledge: talk only to your immediate friends.
### Notes:
- When you need to simplify and unify a large interface or a complex set of interfaces, use a facade.
- A facade decouples a client from a complex subsystem. Therefore, anything in the subsystem changes, the client will not be affected by it.
- Implementing a facade requires that we compose the facade with its subsystem and use delegation to perform the work of the facade.
- You can implement more than one facade for a subsystem.
- _Facade and adapter may wrap multiple classes but a facade's **intent** is to simplify, while an adapter's intent is to convert the interface to something different._
- _Facade don't encapsulate the subsystems classes; they merely provide a simplified interface to their functionality._ Clients are still free and capable to call any method of the subsystem to provide some advanced functionality.

