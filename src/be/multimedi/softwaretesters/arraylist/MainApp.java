package be.multimedi.softwaretesters.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Yannick Van Ham
 * created on Tuesday, 24/11/2020
 */
public class MainApp {
    public static void main(String[] args) {

        ArrayList<String> guestList = new ArrayList<>(
                Arrays.asList("Michael Shannon", "Henry Witherton", "Sara Sherwood", "Michaela Stone")
        );

        String weddingCrasher = "Jonathan Barnes";

        guestList.add(weddingCrasher);

        guestList.forEach();
    }
}
