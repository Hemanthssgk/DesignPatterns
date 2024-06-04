package designPatterns.creational.abstractFactory.jpa;

public class ApacheOpenJPA implements JPA{
    @Override
    public void connectDatabase() {
        System.out.println("Connected using ApacheOpenJPA Implementation");
    }
}
