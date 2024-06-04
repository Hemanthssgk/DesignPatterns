package designPatterns.creational.abstractFactory.notificationFactoryExample;


public class SmsNotification implements Notification
{
    @Override
    public void pushNotification() {
        System.out.println("sending sms notification");
    }
}
