package designPatterns.creational.abstractFactory.jpa;

public class ApacheOpenJpaFactory implements JPAFactory{
    @Override
    public JPA createJPAImplementation() {
        return new ApacheOpenJPA();
    }
}
