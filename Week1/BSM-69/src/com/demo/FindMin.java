package com.demo;

public class FindMin {

    public static void main(String[] args) {

        int[] arr = {3, 1, 5, 8, 9, 10, 2, 4};
        int[] arr2 = {-3, -2, -1, 0, 1, 2, 4};
        int[] arr3 = {-1, -2};

        findMinMissing(arr);
        findMinMissing(arr2);
    }

    public static void findMinMissing(int[] array) {

        int length = array.length;
        array = sortArray(array);

        boolean found = false;

        int min = array[0] < 1 ? 0 : array[0];

        int next = min + 1;

        for (int i = 1; i < length; i++) {
            if (array[i] < next)
                continue;

            if (array[i] != next) {
                int missing = next;
                found = true;
                System.out.println("Missing item: " + missing);
                return;
            } else {
                next++;
            }
        }
        if (!found) {
            System.out.println(next);
        }
    }

    public static void printArray(int[] array) {
//        method to print elements in array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
    }

    public static int[] sortArray(int[] array) {
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

}

