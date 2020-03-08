package Prototype.UsingCloneablejavainterface;

public class User implements Cloneable{
    private String name ;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone()  {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
