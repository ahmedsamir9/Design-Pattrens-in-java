package decorator;

public class DEcoratorICeCream implements iceCream {
    iceCream iceCream ;
    public  DEcoratorICeCream(iceCream cream){
        iceCream = cream;
    }
    @Override
    public int Cost() {
        return iceCream.Cost();
    }
}
