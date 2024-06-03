package designPatterns.creational.factory;

public class NotificationFactory {
    public static Notification getInstance(String instanceType)
    {
        if ("SmsNotification".equalsIgnoreCase(instanceType))
        {
            return new SmsNotification();
        } else if ("WhatsappNotification".equalsIgnoreCase(instanceType)) {
            return new WhatsappNotification();
        } else if ("EmailNotification".equalsIgnoreCase(instanceType)) {
            return new EmailNotification();
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }
}
