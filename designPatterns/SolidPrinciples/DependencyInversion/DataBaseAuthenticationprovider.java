package designPatterns.SolidPrinciples.DependencyInversion;

public class DataBaseAuthenticationprovider implements Authenticationprovider{
    public String getCredentials()
    {
        return "hemanth";
    }
}
