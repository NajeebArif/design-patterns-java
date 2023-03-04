# Command Pattern

### Command pattern - encapsulates a request as an object, thereby letting you parametrize clients with different _request_, queue or log requests and support undoable operations.

### Notes:
- The command pattern decouples an object making a request from the one that actually knows how to perform it.
- A Command object is at the center of this decoupling and encapsulates a receiver with an action(or a set of actions)
- An invoker makes a request of a Command object by calling its execute() method, which invokes those actions on the receiver.
- Invokers can be parametrized with commands, even dynamically at runtime.
- Commands may support undo by implementing an undo method that restores the object to its previous state before execute() method was last called.
- Macro Commands are simple extension of command pattern which allow multiple commands to be invoked. Likewise, Macro command can easily support undo().
- In Practice, it is not uncommon to have _Smart_ command objects to implement the requests themselves rather than delegating to a reciever.
- Commands may also be used to implement logging and transactional system.