So Problem with factory method is if we add new implementation then we need to change the existing
factory class. So to overcome that we can use abstract factory pattern, where everyone can provide
any implementation. Instead of changing any of the factory classes we can ask client to simply change
the object creation.

Use case:
we need to use when we have more than one implementation of a specification, and if we wanna make sure
all the implementation created is not changing the existing classes then we can go for abstract factory.

architecture:
lets say we have JPA specification and implementations are Hibernate and ApacheOpenJPA.
so we need to create factories for both Hibernate and ApacheOpenJPA which will return
their own objects. As we need to have abstract factory, we need to create a factory for JPA
which will have a abstract method called create JPAInstance and return JPA objects.
Now all the Implementation factories needs to implement JPA factory. Now simply.
client can use JPA factory and create his own factory object. Even if there is a new implementation
no need to change the existing factories. simply factory for new implementation needs to implement
JPA factory interface and client can simply change the object creation... thats it....

So by doing so we are abid to the rules said by open closed principle...