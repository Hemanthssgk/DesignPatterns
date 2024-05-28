package designPatterns.creational.singleton;

public class ThreadSafeSingletonDesignPattern {
    private static ThreadSafeSingletonDesignPattern instance;

    private ThreadSafeSingletonDesignPattern()
    {
    }

    public static ThreadSafeSingletonDesignPattern getInstance() throws InterruptedException {
        if (instance == null)
        {
            Thread.sleep(200);
            synchronized (ThreadSafeSingletonDesignPattern.class)
            {
                if (instance == null)
                {
                    instance = new ThreadSafeSingletonDesignPattern();
                }
            }
        }

        return instance;
    }
}
