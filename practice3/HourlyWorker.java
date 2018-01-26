package practice3;

public class HourlyWorker extends Employee {
    private final int SALTINGFORHOUR=150;
    private final int SALTINGFORHOURUP=200;
    private final int NORMALHOUR=40;
    private int salting;

    public HourlyWorker(String name, String surname, int salting) {
        super(name, surname);
        this.setSalting(salting);
    }

    @Override
    void people() {
        System.out.println(this.getName()+" "+this.getSurname());
    }

    @Override
    int calculateSellery(int k) {
        return salting+=SALTINGFORHOURUP*k;
    }

    @Override
    public String toString() {
        return "HourlyWorker{" +
                "SALTINGFORHOUR=" + SALTINGFORHOUR +
                ", SALTINGFORHOURUP=" + SALTINGFORHOURUP +
                ", NORMALHOUR=" + NORMALHOUR +
                ", salting=" + salting +
                '}';
    }

    public int getSALTINGFORHOUR() {
        return SALTINGFORHOUR;
    }

    public int getSALTINGFORHOURUP() {
        return SALTINGFORHOURUP;
    }

    public int getNORMALHOUR() {
        return NORMALHOUR;
    }

    public int getSalting() {
        return salting;
    }

    public void setSalting(int salting) {
        this.salting = salting;
    }
}
