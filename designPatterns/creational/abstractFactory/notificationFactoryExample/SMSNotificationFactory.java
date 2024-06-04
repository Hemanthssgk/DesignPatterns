package designPatterns.creational.abstractFactory.notificationFactoryExample;

public class SMSNotificationFactory implements NotificationFactory{
    @Override
    public Notification createInstance() {
        return new SmsNotification();
    }
}
