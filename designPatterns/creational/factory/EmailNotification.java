package designPatterns.creational.factory;

public class EmailNotification implements Notification{
    @Override
    public void pushNotification() {
        System.out.println("Sending email notification");
    }
}
