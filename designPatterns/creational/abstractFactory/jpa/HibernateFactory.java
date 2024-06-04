package designPatterns.creational.abstractFactory.jpa;

public class HibernateFactory implements JPAFactory{
    @Override
    public JPA createJPAImplementation() {
        return new Hibernate();
    }
}
