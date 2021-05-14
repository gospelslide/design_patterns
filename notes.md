# Creational patterns - Factory, Abstract Factory, Builder, Singleton
# Structural patterns - Adapter, Decorator, Facade
# Behavioral patterns - Strategy, Observer, Command
 
# Strategy pattern 

*Strategy pattern allows the a behavior or algorithm to be selected at runtime.*

Potential use cases include when a parent class has many variations for a particular behaviour.
Defining these behaviors in the parent class may force child classes to override them as they may or may not 
be needed in the child.
If the parent class consists of a number of such variable behaviors it is the ideal for strategy pattern.
Some child classes may override and have same behavior leading to code duplicacy across the child classes.

Concrete classes can set the behavior at runtime as behaviors are interchangeable in strategy pattern.
You might even do away completely with the child classes as a 'strategy' or variation of parent class or client can 
be used instead.

Define a family of algorithms(behaviors), encapsulate each one, and make them interchangeable. Strategy lets the algorithm 
vary independently from the clients that use it.


# Observer pattern

*The Observer Pattern defines a one to many dependency between objects so that one object changes state, all of its dependents are notified and updated automatically.*

Potential use cases are when multiple objects/classes need to be made aware of any change with a particular class.
One approach can be to constantly poll that class to check if it has changed.
Better approach is the class being *observable* maintain a list of subscribers and push the changes to all of them.
Observers will register with the observable class and on state change observable will iterate and notify all the registered listeners.

Usually the observers *has a* observable to get data from it in case of state change.


# Decorator pattern

*Decorator pattern allows a user to add new functionality to an existing object without altering its structure.*

The decorator class acts as sort of a wrapper around class and helps alter it's behavior. It can recursively wrap decorators or the base class.
It will be useful wherever additional behavior needs to be added to a base class. If the additional behavior is similar across decorators (like adding different constants to a value) it may *not* be very useful.
However if we have a base class that needs a combination of multiple behaviors to be attached to it without changing the class itself everytime decorator pattern is 
ideal. Decorators adding behavior or functionality can be wrapped around each other recursively at runtime so no need for code change each time in the base class.

Simply new decorators can be added, wrapped around at runtime and used. Usually the decorator *is a* and *has a* the component to which
it adds functionality.


# Factory method pattern

*Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to (factory) subclasses.*

This pattern helps in offloading the object creation responsibility to a separate creator class. Useful when the object creation requires some logic, data or has 
variations in creation and instantiation. Factory will be the super class and different child classes of Factory will have different object instantiation logic.

Complex object creation or where objects that are to be created are different sub-classes with variations, offloading object creation responsibility to factory 
pattern is a potential use case.


# Abstract factory pattern

*Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.*

Useful in instantiating a group of classes together. Usually the classes may be related or dependant on each other. In other words this pattern can be used to build or create a group of tightly coupled classes. One sample use case will be building a system which has a group of subsystems (the group of classes to be instantiated) such that the subsystems vary according to OS or browser. 
In case of classes that are tightly coupled together to be used, factory method pattern may not make sense as it will create individual objects not enforcing the tight coupling, this is solved by abstract factory.

Use it when some particular combination of objects are required for a use case.

Use the Abstract Factory when your code needs to work with various families of related products, but you don’t want it to depend on the concrete classes of those products—they might be unknown beforehand or you simply want to allow for future extensibility.


# Singleton pattern

*The singleton pattern is a design pattern that restricts the instantiation of a class to one object.*

The singleton class will contain a static method returning an instance of that class. Used when a any resource needs to be shared across the system. For example say maintaining a single db connection across all. 
Some people consider singleton pattern as a code smell as it is considered inflexible. Whenever say in the future you need multiple instances or a new extra instance say for unit tests, this pattern will not allow it. The singleton class will manage access to the single instance of a class for all other classes needing it.

One major problem or code smell is that since a single instance is shared globally, some class may modify the instance without others knowing about it. Common problem which is faced by global variables as well.


# Command pattern

*Encapsulate a request as an object, thereby letting you parametrize clients with different requests, queue or log requests, and support undoable operations.*

The invoker will perform actions on a receiver via various commands. We encapsulate and implement these various commands performing actions on a receiver via the command design pattern. This pattern helps in making a set of actions on any object (receiver) encapsulated or customisable. The command may be combine a list of smaller commands to form a single command or operation.

In a way also helps decouple the invoker and receiver via commands. Can also combine multiple commands into a single command. The command interface also includes an unexecute or undo method which will undo the steps performed by the execute method. So maintaining a list of commands executed, it would be to easy to undo those commands.


# Adapter pattern

*Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.*

Making two incompatible classes/interfaces, compatible. Adapter can also be used as a many to one adapter. For example, makes sense to use a library through an adapter to ensure that even if the library is changed the adapter can still maintain the same output format to the clients.

One main difference between adapter and decorator is that adapter is dumber (has lesser logic). Adapter concerns itself with only adapting the input/output formats required by clients whereas decorator is used to add behavior to another class.


# Facade pattern

*Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.*

Imagine that you must make your code work with a broad set of objects that belong to a sophisticated library or framework. Ordinarily, you’d need to initialize all of those objects, keep track of dependencies, execute methods in the correct order, and so on.

As a result, the business logic of your classes would become tightly coupled to the implementation details of 3rd-party classes, making it hard to comprehend and maintain.

A facade basically provides a facade to all these complex sub systems and access to their functionality. The facade also needs to include only those methods that will need to be used by a client.

In a way helps removing tight coupling between the client class and a huge number of classes/sub classes it will need to contain if facade pattern is not used.


# Builder pattern

*Separate the construction of a complex object from its representation so that the same construction process can create different representations*

Creational pattern used to create complex objects. USP is that it allows the complex creation to occur step by step and return the object in the final step. Obvious advantage is that steps can be interchanged or swapped to create new objects easily. Helps initialize complex objects in a simple and reusable manner.

Think of it as a factory assembly line, with each step partially building an object. Another complex object with only slightly different variations can be created very easily.