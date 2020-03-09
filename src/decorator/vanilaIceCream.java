package decorator;

public class vanilaIceCream extends DEcoratorICeCream {
    public vanilaIceCream(decorator.iceCream cream) {
        super(cream);
    }

    @Override
    public int Cost() {
        return (int) (2+ super.Cost());
    }

}
