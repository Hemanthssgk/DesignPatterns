package designPatterns.creational.abstractFactory.jpa;

public class Hibernate implements JPA{
    @Override
    public void connectDatabase() {
        System.out.println("Connected using Hibernate Implementation");
    }
}
