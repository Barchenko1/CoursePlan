package practice3;

public class CommissionWorker extends Employee {

    private int basePay;
    private int commis;

    public CommissionWorker(String name, String surname, int basePay, int commis) {
        super(name, surname);
        this.setBasePay(basePay);
        this.setCommis(commis);
    }

    @Override
    void people() {}

    @Override
    int calculateSellery(int k) {
        return basePay+=commis*k;
    }

    @Override
    public String toString() {
        return "CommissionWorker{" +
                "basePay=" + basePay +
                ", commis=" + commis +
                '}';
    }

    public int getBasePay() {
        return basePay;
    }

    public void setBasePay(int basePay) {
        this.basePay = basePay;
    }

    public int getCommis() {
        return commis;
    }

    public void setCommis(int commis) {
        this.commis = commis;
    }
}
