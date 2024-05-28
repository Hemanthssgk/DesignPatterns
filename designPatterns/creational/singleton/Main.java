package designPatterns.creational.singleton;

import java.io.*;

public class Main {
//    public static void main(String[] args) {
//        LazySingletonDesignPattern lazySingletonDesignPattern = LazySingletonDesignPattern.getSingletonInstance();
//        System.out.println(lazySingletonDesignPattern);
//    }

//    public static void main(String[] args) {
//        EagerSingletonDesignPattern eagerSingletonDesignPattern = EagerSingletonDesignPattern.getInstance();
//        EagerSingletonDesignPattern eagerSingletonDesignPattern1 = EagerSingletonDesignPattern.getInstance();
//        System.out.println(eagerSingletonDesignPattern1);
//        System.out.println(eagerSingletonDesignPattern);
//    }

    /**
     * Below code will break the singleton condition. while running the getinstance method it is waiting for some time
     * now thread 1 is waiting for some time and thread 2 is waiting for some time.. so it is like..
     * both entered the null check block and waiting there. and both got different objects....
     * @param args
     */
//    public static void main(String[] args) {
//        Thread t1 = new Thread(() -> {
//            LazySingletonDesignPattern instance = null;
//            try {
//                instance = LazySingletonDesignPattern.getSingletonInstance();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(instance);
//        });
//
//        Thread t2 = new Thread(() -> {
//            LazySingletonDesignPattern instance = null;
//            try {
//                instance = LazySingletonDesignPattern.getSingletonInstance();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(instance);
//        });
//
//        t1.start();
//        t2.start();
//    }
//        public static void main(String[] args) {
//        Thread t1 = new Thread(() -> {
//            ThreadSafeSingletonDesignPattern instance = null;
//            try {
//                instance = ThreadSafeSingletonDesignPattern.getInstance();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(instance);
//        });
//
//        Thread t2 = new Thread(() -> {
//            ThreadSafeSingletonDesignPattern instance = null;
//            try {
//                instance = ThreadSafeSingletonDesignPattern.getInstance();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(instance);
//        });
//
//        t1.start();
//        t2.start();
//    }
    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
        LazySingletonDesignPattern lazySingletonDesignPattern = LazySingletonDesignPattern.getSingletonInstance();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.obj"));
        out.writeObject(lazySingletonDesignPattern);

        ObjectInputStream inp = new ObjectInputStream(new FileInputStream("object.obj"));
        System.out.println(((LazySingletonDesignPattern)inp.readObject()));

        System.out.println(lazySingletonDesignPattern);

        SerializableSingletonDesignPattern singletonDesignPattern = SerializableSingletonDesignPattern.getInstance();

        out.writeObject(singletonDesignPattern);
        System.out.println(singletonDesignPattern);
        System.out.println(inp.readObject());
    }
}
