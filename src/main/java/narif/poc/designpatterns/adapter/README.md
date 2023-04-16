# Adapter Pattern

### Adapter Pattern: converts the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

### Notes:
- Converts an interface to the one which is compatible with the client.
- Could be tedious when the interface has lot of methods, then all of them will have to be implemented by the adapter.
- One very powerful usecase is that it lets client use any new library and its subsets without making any change to the code.
- When you need to use an existing class and the interface is not the one you need, then use Adapter.
- Implementing an adapter may require little work or a great deal of work depending on the size and complexity of the interface.
- There are two types of adapters: Object and Class adapters, Class Adapters require multiple inheritance.
- An Adapter wraps an object to change its interface, a decorator wraps an object to add new behaviors and responsibility and facade wraps a set of objects to simplify.

--- 
| Pattern            | Does What? |
|--------------------|------------|
| Adapter Pattern    | Converts one interface to another |
| Decorator Pattern  | Doesn't alter the interface but adds responsibility |
| Facade Pattern | Makes an interface simpler |
