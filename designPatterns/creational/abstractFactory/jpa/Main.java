package designPatterns.creational.abstractFactory.jpa;

public class Main {
    public static void main(String[] args) {
        JPAFactory jpaFactory = new HibernateFactory();
        JPA jpa = jpaFactory.createJPAImplementation();
        jpa.connectDatabase();
    }
}
