# Observer Pattern

### Observer Pattern: defines one to many dependency between objects so that when one object changes state all its dependent objects are notified and updated automatically.

#### Publisher (Subjects) + Subscribers (Observers) = Observer Pattern

### Design Principles

- Strive for Loosely coupled designs between objects that interact
  - Consider an example of tightly woven basket, more stiffness makes it easier to break instead of a loosely woven, flexible basket.
  - Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimise the interdependency between objects

#### Different Design principles apart from Loose coupling

- Identify the aspects of your application that vary and separate them from what stays same:
  - The thing that varies in Observer pattern is the State of the Subject and the number and types of Observers. With this pattern one can vary the objects that are dependent on the state of the subject without having to change that subject.
- Program to an interface and not implementation
  - Both Subject and Observers use interfaces. Subject keeps track of objects implementing the Observer interface, while the Observers register with, and get notified by, the Subject interface. This keeps things nice and loosely coupled.
- Favor composition over inheritance:
  - The Observer Pattern uses composition to compose any numbers of Observers with their Subject. These relationships are not set up by some kin dof inheritance hierarchy.