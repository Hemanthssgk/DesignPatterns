package designPatterns.creational.abstractFactory.notificationFactoryExample;

public class EmailNotificationFactory implements NotificationFactory{

    @Override
    public Notification createInstance() {
        return new EmailNotification();
    }
}
