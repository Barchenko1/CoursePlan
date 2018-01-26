package practice3;

public class PriceWorker extends Employee {
    private int payForDetals;

    public PriceWorker(String name, String surname, int payForDetals) {
        super(name, surname);
        this.setPayForDetals(payForDetals);
    }


    @Override
    void people() {
        System.out.println(getName()+" "+getSurname());
    }

    @Override
    int calculateSellery(int k) {
        return payForDetals*k;
    }

    @Override
    public String toString() {
        return "PriceWorker{" +
                "payForDetals=" + payForDetals +
                '}';
    }

    public int getPayForDetals() {
        return payForDetals;
    }

    public void setPayForDetals(int payForDetals) {
        this.payForDetals = payForDetals;
    }
}