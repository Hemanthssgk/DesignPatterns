package designPatterns.creational.singleton;

import java.io.ObjectStreamException;
import java.io.Serial;
import java.io.Serializable;

public class SerializableSingletonDesignPattern implements Serializable {
    private static SerializableSingletonDesignPattern instance;

    private SerializableSingletonDesignPattern()
    {
    }

    public static SerializableSingletonDesignPattern getInstance()
    {
        if (instance==null)
        {
            instance = new SerializableSingletonDesignPattern();
        }
        return instance;
    }
    @Serial
    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }
}
