package Stepik;

//Реализуйте метод, сливающий два отсортированных по неубыванию(возрастанию) массива чисел в один отсортированный в том же порядке массив.
// Массивы могут быть любой длины, в том числе нулевой.

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int [] a1 = {8,5,8,3,7,1,3,6,9};
        int [] a2 = {0,7,3,7,2,7,8};
        mergeArrays(a1,a2);
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] array = new int[a1.length + a2.length];
        int count = 0;

        //Алгоритм слияния двух массивов в один
        for (int i = 0; i < a1.length; i++) {
            array[i] = a1[i];
            count++;
        }
        for (int i : a2) {
            array[count++] = i;
        }

        //Сортировка массива по возрастанию
        Arrays.sort(array);
//        int temp;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
        for (int j : array) {
            System.out.println(j + " ");
        }
        return array; // your implementation here
    }
}
