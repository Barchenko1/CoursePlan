package clothing;

public class Shirt extends Clothing {

    public Shirt(String name, int price) {
        super(name, price);
    }

    @Override
    public void wash() {
        System.out.println("Shirt is clean");
    }

    @Override
    public String howToClean() {
        return "with 20 degree";
    }

}