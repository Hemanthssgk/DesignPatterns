What is Factory Design Pattern?
Lets say we have more than one implementation then instead of creating
the objects in the low level classes we can expose a new class called
factory class which will create object based on the parameter passed.

So it is as below..
we have two implementation of JPA.
JPA --> interface
Hibernate --> 1st implementation
ApacheOpenJpa --> 2nd implementation

Now to implement factory pattern we need to create a JPA factory class which will have a
createInstance method, which will take the input of what type of object we are expecting.
and return type should be of JPA to ensure loose coupling. So in case we have new
implementation, we can implement by implementing JPA interface and JPAImplementationFactory
should be updated with the type of object it has to return. Here Open closed principle is violated!!

Now to overcome this factory object change issue. we have abstract factory pattern.

use Case:
We can use this when we know there won't be any changes added in the future and if we wanna
hide the implementation or if we wanna delegate the object creation to separate class then we
can  use factory design pattern..

So architecture is like.
We have a product. And each product(Notification or JPA) has its own implementation(SMSNotification / Hibernate).
Now the choice of which product needs to be used(i.e object creation) is delegated to separate class called
factory classes(JPA Factory / Notification Factory), which will return the type of product based on the
parameter passed.

