package com.fedorenko.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class ArrayService {
    private final Random random = new Random();

    public int[] createArray() throws IOException {
        int[] array = new int[getArrayLength()];
        array = random.ints(array.length, -100, 100).toArray();
        System.out.println(Arrays.toString(array));
        return array;
    }
    public int[] sort(final int[] array) throws IOException {
        System.out.println("Do you want Ascending or Descending sort?");
        System.out.println("Print A or D.");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String consoleString = bufferedReader.readLine();
            if (consoleString.equals("A")) {
                return ascendingSort(array);
            } else if (consoleString.equals("D")) {
                return descendingSort(array);
            } else {
                System.out.println("You print wrong character. Try again.");
                return array;
            }
    }
    public long[] cubeEachThird(final int[] array) {
        long [] newArray = new long[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        for (int i = 0; i < array.length; i+=3) {
            newArray[i] = Math.round(Math.pow(array[i], 3));
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    private int[] ascendingSort (final int[] array) {
        int[] newArray = new int[array.length];
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
                int a = array[i];
                array[i] = array[index];
                array[index] = a;
                newArray[i] = min;

        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
    private int[] descendingSort(final int[] array) {
        int[] newArray = new int[array.length];
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            int maxValue = Integer.MIN_VALUE;
            for (int j = i; j < array.length; j++) {
                if (array[j] > maxValue) {
                    maxValue = array[j];
                    index = j;
                }
            }
            int a = array[i];
            array[i] = array[index];
            array[index] = a;
            newArray[i] = maxValue;

        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    private int getArrayLength() throws IOException {
        Integer consoleNumber;
        System.out.println("Choose length of array. It must be 10 or bigger.");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            consoleNumber = Integer.parseInt(bufferedReader.readLine());
        if (consoleNumber < 10) {
            return 10;
        } else {
            return consoleNumber;
        }
    }
}
