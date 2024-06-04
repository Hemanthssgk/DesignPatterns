package designPatterns.creational.abstractFactory.notificationFactoryExample;

public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new EmailNotificationFactory();
        Notification emailNotification = notificationFactory.createInstance();
        emailNotification.pushNotification();
    }
}
