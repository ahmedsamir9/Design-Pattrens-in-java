package singletone;

public class Singleton {
    public Singleton() {
    }
    private  volatile static Singleton synSingletonInstance;
    public String name;
    public static Singleton getInstance(){
        if(synSingletonInstance == null){
            synchronized (Singleton.class){
                if(synSingletonInstance == null){
                    synSingletonInstance = new Singleton();
                }
            }

        }
        return synSingletonInstance;
    }
}
