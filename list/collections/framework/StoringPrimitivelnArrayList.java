package list.collections.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StoringPrimitivelnArrayList {
    int y = 2;
    Integer x = 2;
    public static void main(String[] args) {
        List<Integer> intArray;
        intArray = new ArrayList<>();
        intArray.add(10);
        intArray.add(20);
        intArray.add(30);
        intArray.add(40);
        intArray.add(40);
        /*
        for each loop
         */
        System.out.println(" Iterating by for each loop");
        for (Integer it  : intArray){
            System.out.println(it);
        }
        /*
        intArray.add(0,10);
        intArray.add( 1, 20);
        intArray.add(2, 30);
        intArray.add( 3, null);
        intArray.add( 4,40);
         */
        /*
        for loop
         */

        System.out.println(" Iterating by for loop");
        for (int i = 0; i < intArray.size(); i++){
            System.out.println(intArray.get(i));
        }
    }
}
