package clothing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Shirt shirt=new Shirt("Shirt",250);
        Clothing clothing=new Shirt("Shirt1",250);
        shirt.wash();
        clothing.wash();
        Loundry loundry=new Loundry();
        loundry.clean(shirt);
        Clothing[] clothings={shirt,new Trousers("Trousers1",500),clothing, new Trousers("Trousers",700)};
        System.out.println("`````````````````````````````````````");
        for (Clothing clothing1 : clothings) {
            System.out.println(clothing1);
        }
        Arrays.sort(clothings);
        System.out.println("`````````````````````````````````````");
        for (Clothing clothing1 : clothings) {
            System.out.println(clothing1);
        }
        System.out.println("`````````````````````````````````````");
        Arrays.sort(clothings, new ClothComparator());
        System.out.println("`````````````````````````````````````");
        for (Clothing clothing1 : clothings) {
            System.out.println(clothing1);
        }
        System.out.println("`````````````````````````````````````");
        for (Clothing clothing1:clothings){
            clothing1.wash();
        }
    }
}
