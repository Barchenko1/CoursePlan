package lecture9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        //Human human=createHumanConsole();
        //System.out.println(human);
        System.out.println(createHumanCheck());
    }
    private static Human createHumanCheck(){
        Human human=new Human();
        try (BufferedReader br=new BufferedReader(new InputStreamReader(new UncloseSystemIn(System.in)))){
            while (true){
                System.out.println("Input human's name");
                String name=br.readLine();
                try {
                    human.setName(name);
                    break;
                } catch (HumanNameException e) {
                    System.out.println(e.getMessage());
                }
            }
            while (true){
                int age=readNumberConsole(br,"Input human's age");
                try {
                    human.setAge(age);
                    break;
                } catch (HumanAgeExceprion e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return human;
    }

    public static Human createHumanConsole() {
        Human human=null;
         try (BufferedReader br=new BufferedReader(new InputStreamReader(new UncloseSystemIn(System.in)))){
            System.out.println("Input human's name");
            String name=br.readLine();
             int age=readNumberConsole(br,"Input human's age");
             while (true) {
                try {
                    human = new Human(name, age);
                    break;
                } catch (HumanAgeExceprion e) {
                    System.out.println(e.getMessage());
                    age = readNumberConsole(br,"Input human's age");
                    e.printStackTrace();
                } catch (HumanNameException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Input human's name");
                    name=br.readLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return human;
    }

    private static int readNumberConsole(BufferedReader br,String message) throws IOException {
        int number;
        while (true) {
            try {
                System.out.println(message);
                number = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not a number");
            }
        }
        return number;
    }
}
