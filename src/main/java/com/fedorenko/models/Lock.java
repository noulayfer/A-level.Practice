package com.fedorenko.models;

import java.util.Arrays;

public class Lock {
    private final int[] array;


    public Lock(final int[] array) {
        this.array = array;
    }
    public int[] getArray() {
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
    public void printArray() {
        System.out.println(Arrays.toString(array));
    }
}
