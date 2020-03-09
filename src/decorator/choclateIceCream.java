package decorator;

public class choclateIceCream extends DEcoratorICeCream {
    public choclateIceCream(decorator.iceCream cream) {
        super(cream);
    }

    @Override
    public int Cost() {
        return (int) (1.0 + super.Cost());
    }
}
