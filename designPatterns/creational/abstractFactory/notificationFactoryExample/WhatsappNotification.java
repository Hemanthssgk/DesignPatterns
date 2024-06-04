package designPatterns.creational.abstractFactory.notificationFactoryExample;


public class WhatsappNotification implements Notification {
    @Override
    public void pushNotification() {
        System.out.println("sending Whatsapp Notification");
    }
}
