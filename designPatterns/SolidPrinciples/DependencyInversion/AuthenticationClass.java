package designPatterns.SolidPrinciples.DependencyInversion;

public class AuthenticationClass {

    public boolean authenticate(Authenticationprovider provider, String userName)
    {
        String userFromDatabase = provider.getCredentials();
        return userName.equals(userFromDatabase);
    }
}
