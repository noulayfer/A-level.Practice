package com.fedorenko;

import com.fedorenko.models.Lock;
import com.fedorenko.service.ArrayService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        ArrayService arrayService = new ArrayService();
//        int[] array = arrayService.createArray();
//        arrayService.sort(array);
//        arrayService.cubeEachThird(array);

        Lock lock = new Lock(new int[]{1, 2, 4});
        lock.printArray();
        lock.getArray()[0] = 0;
        lock.printArray();
    }
}
