package designPatterns.creational.factory;

public class MainClass {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.getInstance("sms");
        notification.pushNotification();
    }
}
