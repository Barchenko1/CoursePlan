package comics;

public class SuperMan extends Good implements Skills,Alien,Suit {
    void skills(){
        System.out.println("I have fire from my eyes");
    }
    void alien(){
        System.out.println("I am from Kripton");
    }

    void suit(){
        System.out.println("I have suit");
    }

}
