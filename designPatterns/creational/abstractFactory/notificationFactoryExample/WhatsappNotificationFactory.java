package designPatterns.creational.abstractFactory.notificationFactoryExample;

public class WhatsappNotificationFactory implements NotificationFactory {

    @Override
    public Notification createInstance() {
        return new WhatsappNotification();
    }
}
