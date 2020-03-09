package decorator;

public class main {
    public static void main(String[] args) {
        baseIceCream iceCream = new baseIceCream();
        vanilaIceCream cream = new vanilaIceCream(iceCream);
        System.out.println(iceCream.Cost() +"***********"+cream.Cost());
    }

}
