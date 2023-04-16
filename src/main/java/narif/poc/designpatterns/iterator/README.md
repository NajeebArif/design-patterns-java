# Iterator Pattern
###### Well Managed Collections

---

### Iterator Pattern: Provide a way to access the elements o fan aggregate object sequentially without exposing its underlying structure.

### Design Principle:
- Single Responsibility Principle (SRP): A class should have only reason to change.

### Notes
- Collections are a group of objects. They might be stored in very different data structures like lists, arrays, or hash maps, but they're still collections. 
- An Iterator allows access to an aggregate's element without exposing its internal structure.
- An iterator takes the job of iterating over an aggregate and encapsulates it in another object.
- When using an iterator we relieve the aggregate of the responsibility of supporting operations of traversing its data.
- An iterator provides a common interface for traversing the items of an aggregate, allowing you to use polymorphism when writing code that makes use of the items of the aggregate.
- The iterable interface provides a means of getting an iterator and enables Java;s enhanced for loop.
- We should strive to assign only one responsibility to one class (SRP). Every responsibility of a class is an area of potential change. More than one responsibility means more than one area of change. 