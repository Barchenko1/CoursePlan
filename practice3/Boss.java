package practice3;

public class Boss extends Employee {
    private int payForWeek;

    public Boss(String name, String surname,int payForWeek) {
        super(name, surname);
        this.setPayForWeek(payForWeek);

    }

    public int getPayForWeek() {
        return payForWeek;
    }

    public void setPayForWeek(int payForWeek) {
        this.payForWeek = payForWeek;
    }

    @Override
    void people() {
        System.out.println(getName()+" "+getSurname());
    }

    @Override
    int calculateSellery(int k) {
        return payForWeek*k;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "payForWeek=" + payForWeek +
                '}';
    }
}
