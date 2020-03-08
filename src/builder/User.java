package builder;

public class User {
    private String name;
    private String address;
    private String Ssn;
    private int age;

    public User(String name, String address, String ssn, int age) {
        this.name = name;
        this.address = address;
        Ssn = ssn;
        this.age = age;
    }
    public User(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSsn() {
        return Ssn;
    }

    public void setSsn(String ssn) {
        Ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static class userBuilder implements Userbuilder{
        private static User user;

        public userBuilder() {
            user = new User();
        }

        @Override
        public Userbuilder name(String name) {
           user.name =name;
            return this;
        }

        @Override
        public Userbuilder address(String address) {
            user.address = address;
            return this;
        }

        @Override
        public Userbuilder Ssn(String Ssn) {
            user.Ssn = Ssn;
            return this;
        }

        @Override
        public Userbuilder age(int age) {
            user.age = age;
            return this;
        }

        @Override
        public User buid() {
            return user;
        }
    }
}
