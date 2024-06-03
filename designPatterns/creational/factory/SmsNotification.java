package designPatterns.creational.factory;

public class SmsNotification implements Notification
{
    @Override
    public void pushNotification() {
        System.out.println("sending sms notification");
    }
}
