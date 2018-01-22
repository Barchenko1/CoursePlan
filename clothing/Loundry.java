package clothing;

import clothing.Cleanable;

public class Loundry {
    public void clean(Cleanable thing){
        System.out.println(thing.getClass().getSimpleName()+" is cleanew with "+thing.howToClean());

    }
}
