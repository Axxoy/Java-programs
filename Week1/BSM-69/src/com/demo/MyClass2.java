package com.demo;

public class MyClass2 {
    public static void main(String[] args) {

        int[] arr = {3, 1, 5, 8, 9, 10, 2, 4};
        int[] arr2 = {-3, -2, -1, 0, 1, 2, 4};
        int[] arr3 = {-1, -2};

//        sortArray(arr);
        findMinMissing(arr);
        findMinMissing(arr2);
        findMinMissing(arr3);

        int[][] firstArray = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] secondArray = {
                {7, 2},
                {2, 3},
                {6, 4}
        };

        multiplyMatrix(firstArray, secondArray);
    }


    public static int findMax(int[] array) {
        // assume max value is first element
        int max = array[0];
        int length = array.length;

        // for loop to iterate through the array and check
        for (int i = 0; i < length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        // return max value
        return max;
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

    public static void printArray(int[] array) {
//        method to print elements in array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
    }

    public static void findMinMissing(int[] array) {

        // 🔴 find the smallest missing positive number (didn't understand this) - ask for code. Should not be 0

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

        printArray(array);

        // ---

        boolean found = false;
        int min;
        if (array[0] < 1) {
            min = 0;
        } else {
            min = array[0];
        }
        int next = min + 1;

        for (int i = 1; i < length; i++) {
            if (array[i] < next) {
                continue;
            }
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
            System.out.println("Missing item: " + next);
        }
    }

    // Next to do: Matrix Multiplication. Should work for all different dimensions.

    public static int[][] multiplyMatrix(int[][] arr1, int[][] arr2) {

//        Check if multiplication is possible
        if (arr1[0].length != arr2.length) {
            System.out.println("Error! Can't multiply matrices.");
        }

//        Multiply matrices

        
        return arr1;
    }
}
