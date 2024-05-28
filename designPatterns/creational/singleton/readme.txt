What is singleton class?
No matter how many times u call the class, it will create only one instance throughout the program lifecycle.

How to make singleton class?
simple way is to make a static variable and make its access as private. and this variable should be of SingletonClass.
now make the constructor private so that it wont allow other classes to create the object from outside the class.
now create a static method lets say getInstance and in that do the null check and return the object if it is no null every time.

Types of singleton??
Lazy and eager.
Lazy will create object when getInstance method is called. --> referLazySingltonClass
Eager will create object when class is loaded into the jvm. --> referEagerSingltonClass

Ensuring thread safe object creation...
But the code written in both eager and lazy singleton pattern class are not thread safe. If two different
threads are tyring to access the getInstance, when t1 is trying to execute null and during that time only
t2 has started executing calling constructor, then things gets fucked up and it will create tow different
objects for two threads. so overcome this we need to use synchronized blocks with double null check..

Why double null checks????
so basically lets say two threads are trying to get the instance. Let's say after 1st null check there is a thread sleep..
now at that time second instance also completes the null check now both will be inside null check block which means
after one thread releases the lock other will get the lock and creates a new instance again.. hence we need to synchronize
while creating a instance and dual null check will make sure there no threads will get different instances..

Note:
this threadsafesingleton is only synchronized to create objects. if we are invoking any method using the object, then it can
create race condtion.. to overcome that, we need to make the class thread safe...

Is it possible to break this singleton class?
yes so when we use serialization it won't return same object all the time... to overcome that we need to override a method read resolve method.

Why serialization and deserialization is creating new instance??
before seralizing the state of the object is stored in one location. now during serialization we are storing the state into a file. Once serialization
 is done state of the object is stored in file as well as heap..

Now during deserialzation, when object is read from the file. it has to store somewhere. so when we try to assign that data from file
to a variable it will create a new space at different memory location, Hence we are having two different hashcode. Hence, we need to override
readresolve method. which will be called by jvm only during deserialzation. so once read from the file. instead of using the state of state stored
in the file, latest state of the object present in the heap is used..