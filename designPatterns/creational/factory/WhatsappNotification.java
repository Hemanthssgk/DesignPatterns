package designPatterns.creational.factory;

public class WhatsappNotification implements Notification{
    @Override
    public void pushNotification() {
        System.out.println("sending Whatsapp Notification");
    }
}
