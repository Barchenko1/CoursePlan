package practice3;

public class Main {
    public static void main(String[] args) {
        Boss boss=new Boss("Pasha","Barchenko",10000);
        System.out.println(boss);
        System.out.println(boss.calculateSellery(4));
        boss.people();
        HourlyWorker hourlyWorker=new HourlyWorker("имя рабочего","фамилия рабочего",2000);
        System.out.println(hourlyWorker);
        hourlyWorker.people();
        System.out.println(hourlyWorker.calculateSellery(3));
        PriceWorker priceWorker=new PriceWorker("мой рабочий","фам моего рабочего",12);
        System.out.println(priceWorker);
        System.out.println(priceWorker.calculateSellery(200));
        priceWorker.people();
        CommissionWorker commissionWorker=new CommissionWorker("рабочий1","рабочий1",3200,25);
        System.out.println(commissionWorker);
        System.out.println(commissionWorker.calculateSellery(10));
    }
}
