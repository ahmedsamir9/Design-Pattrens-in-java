package Prototype.Generic;

public class main {
    public static void main(String[] args) {
        User u1 = new User("samir",21);


        User  u2= (User) u1.Clone();

        System.out.println(u1.getName() +"\n"+u2.getName());
    }
}
