package builder;

public interface Userbuilder {
    public Userbuilder name(String name);
    public Userbuilder address(String address);
    public Userbuilder Ssn(String Ssn);
    public Userbuilder age(int age);
    public User buid();
}
