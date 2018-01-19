package lemonList;

import java.util.ArrayList;
import java.util.HashMap;

public class LemonArrayList<E> {

    private final int SIZE=10;
    private LemonArrayList[] array=new LemonArrayList[SIZE];
    private int place=0;

    public void add(LemonArrayList item) {
        if(place == array.length-1)
            resize(array.length*2);
        array[place++]=item;
    }

    private void resize(int newSize) {
        LemonArrayList[] newArray=new LemonArrayList[newSize];
        System.arraycopy(array, 0, newArray, 0, place);
        array=newArray;
    }

    public E get(int index){
        return (E) array[index];
    }

    public void remove(int index){
        for (;index<place;index++){
            array[index]=array[index+1];
        }
        array[place]=null;
        place--;
    }

    public int size(){
        return array.length;
    }

    E elementData(int index) {
        return (E) array[index];
    }
    public E set(LemonArrayList e) {
        E oldValue = elementData(place);
        array[place] = e;
        return oldValue;
    }


}
