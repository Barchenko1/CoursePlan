package lecture9;

public class Human {
    private static final int MIN_AGE =0;
    private static final int MAX_AGE =100;
    public static final String WRONG_AGE_MESSAGE = "Wrong age,use age from " + MIN_AGE + " to " + MAX_AGE;
    private static final int MIN_NAME_LENGTH = 2;
    private static final String WRONG_NAME_MESSAGE ="Wrong name use name length mmore then "+MIN_NAME_LENGTH;
    private String name;
    private int age;

    public Human() {

    }

    public Human(String name, int age) throws HumanNameException,HumanAgeExceprion {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws HumanNameException {
        if(name.length()>MIN_NAME_LENGTH){
            this.name=name;
        }else{
            throw new HumanNameException(WRONG_NAME_MESSAGE);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws HumanAgeExceprion {
        if (age>MIN_AGE&&age<MAX_AGE){
            this.age = age;
        }else{
            throw new HumanAgeExceprion(WRONG_AGE_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
