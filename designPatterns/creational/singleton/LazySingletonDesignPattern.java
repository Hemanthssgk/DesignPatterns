package designPatterns.creational.singleton;

import java.io.Serializable;

/**
 * Purpose of singleton class to have only one instance of the object for the entire program...
 * eg would be creating a user, creating a database connection...
 */
public class LazySingletonDesignPattern implements Serializable {
    /**
     * making this variable to private static because, we want only one instance to return throughout the program, so making it private will not allow changes of this variable.
     * and static because we are updating it in static method, hence made the variable as static, as it has private access, it wont allow to access using class name....
     */
    private static LazySingletonDesignPattern instance = null;

    /**
     * Made constructor as private because we dont anyone from outside the class to create a new object any time...
     */
    private LazySingletonDesignPattern()
    {
    }

    /**
     * Using this we are creating a instance for the first time and for all other time we are just returning the created object...
     * @return
     */
    public static LazySingletonDesignPattern getSingletonInstance() throws InterruptedException {
        if (instance == null)
        {
//            Thread.sleep(200);
            instance = new LazySingletonDesignPattern();
        }
        return instance;
    }
}

