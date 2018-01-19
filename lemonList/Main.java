package lemonList;
public class Main {
    public static void main(String[] args) {
        LemonArrayList arr1=new LemonArrayList<>();
        Man man0=new Man("Vasya",25);
        Man man1=new Man("Fedya",26);
        Man man2=new Man("Iban",30);
        Man man3=new Man("Sanya",22);
        Man man4=new Man("Vasya",33);
        Man man5=new Man("Ibragim",55);
        Man man6=new Man("Pasha",21);
        Man man7=new Man("Vasya",98);
        Man man8=new Man("Vasya",14);
        Man man9=new Man("Kyzma",51);
        Man man10=new Man("Eminem",30);
        Man man11=new Man("Man",25);
        arr1.add(man1);
        arr1.remove(0);

        System.out.println(arr1.get(0));
        System.out.println(arr1.size());
    }

}
