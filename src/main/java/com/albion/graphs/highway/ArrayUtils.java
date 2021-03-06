package com.albion.graphs.highway;


import java.util.ArrayList;

/**
 * This class is implemented for you. Feel free to add any other methods to this class but it is not
 * necessary.
 *
 */
public class ArrayUtils {
    /**
     * Use this class to create a v2 of an array list of cities. This may or may not be needed
     * based on your implementation
     */
    public static ArrayList<String> cloneArray(ArrayList<String> src) {
        ArrayList<String> dst = new ArrayList<>();
        for (String s : src) {
            dst.add(s);
        }
        return dst;
    }
}
