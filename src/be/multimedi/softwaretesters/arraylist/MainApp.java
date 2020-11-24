package be.multimedi.softwaretesters.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Yannick Van Ham
 * created on Tuesday, 24/11/2020
 */
public class MainApp {
    public static void main(String[] args) {

        // 03.01 ArrayList
        // You can declare and initialise an ArrayList by using Arrays.asList
        ArrayList<String> guestList = new ArrayList<>(
                Arrays.asList("Michael Shannon", "Henry Witherton", "Sara Sherwood", "Michaela Stone")
        );

        String weddingCrasher = "Jonathan Barnes";

        // ArrayLists are mutable (have resizable lengths) so adding elements beyond the capacity is as easy
        // as making use of an 'add' method
        guestList.add(weddingCrasher);

        // 03.02 Accessing ArrayLists
        // Access ArrayList elements with 'get' and the element's index
        // Note: ArraLists are zero-indexed, meaning you start counting from 0 not from 1
        System.out.println(guestList.get(0));
    }
}
