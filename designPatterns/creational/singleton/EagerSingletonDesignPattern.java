package designPatterns.creational.singleton;

public class EagerSingletonDesignPattern {
    private static EagerSingletonDesignPattern instance = new EagerSingletonDesignPattern();

    private EagerSingletonDesignPattern()
    {
    }

    public static EagerSingletonDesignPattern getInstance()
    {
        return instance;
    }
}
