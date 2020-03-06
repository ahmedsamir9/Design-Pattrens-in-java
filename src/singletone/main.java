package singletone;

public class main {
    public static void main(String[] args) {
        Singleton synSingleton1 = Singleton.getInstance();
        Singleton synSingleton2 = Singleton.getInstance();
        System.out.println(synSingleton1);
        System.out.println(synSingleton2);
    }
}
