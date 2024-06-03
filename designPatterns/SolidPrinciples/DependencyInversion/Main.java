package designPatterns.SolidPrinciples.DependencyInversion;

public class Main {
    public static void main(String[] args) {
        Authenticationprovider dataBaseAuthenticationprovider = new DataBaseAuthenticationprovider();
        AuthenticationClass authenticationClass = new AuthenticationClass();
        System.out.println(authenticationClass.authenticate(dataBaseAuthenticationprovider,"hemanth"));
    }

}
