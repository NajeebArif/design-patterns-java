# Decorator Pattern

### Decorator Pattern: Decorator pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

### Design Principles:
- Open Close Principle
  - Objects should be open for extension and closed for modification.

#### Key Points on Decorator:
- Decorators have the same supertype as the object they decorate.
- You can use one or more decorator to wrap an object.
- Given that the decorators have the same supertype as the object it decorates, we can pass around the decorated object in place of the original object.
- The decorator adds its own behavior before or after delegating to the object it decorates to do the rest of the job.
- Objects can be decorated at any time, so we can decorate objects dynamically at runtime with as many decorators as we like. 