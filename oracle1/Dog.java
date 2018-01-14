package oracle1;

abstract class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract String Gav();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
interface Fighter{
    String run();
    String fight();
}
public class Dog extends Animal implements Fighter{

    public String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.setBreed(breed);

    }

    @Override
    String Gav() {
        return "Gaaaaav";
    }

    @Override
    public String toString() {
        return "Dog{}";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public static void main(String[] args) {
        Dog dog=new Dog("Dic",5,"Овчарка");
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getBreed());
        System.out.println(dog.Gav());
        System.out.println(dog.run());
        System.out.println(dog.fight());
    }

    @Override
    public String run() {
        return "I can run";
    }

    @Override
    public String fight() {
        return "I can fight";
    }
}
