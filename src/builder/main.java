package builder;

public class main {
    public static void main(String[] args) {
    User u1 = new User.userBuilder().name("ali").address("sa").buid();
    User u2 = new User.userBuilder().name("box").buid();
    }
}
