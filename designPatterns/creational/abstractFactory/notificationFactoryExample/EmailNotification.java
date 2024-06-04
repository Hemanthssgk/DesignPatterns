package designPatterns.creational.abstractFactory.notificationFactoryExample;


public class EmailNotification implements Notification {
    @Override
    public void pushNotification() {
        System.out.println("Sending email notification");
    }
}
