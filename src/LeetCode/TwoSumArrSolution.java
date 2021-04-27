package LeetCode;

/*
    Easy level

    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Мы имеем масив чисел типа int и target(цель).Нужно вернуть индексы тех чисел которые в сумме дают target.
    Если у нас есть массив num = [2,7,11,15],а target = 9; Решение: [0,1], то есть вывод это индексы чисел
    которые в сумме равны target. Первый[0] и второй[1] элемент массива.
    */


import java.util.Arrays;
import java.util.Scanner;


public class TwoSumArrSolution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        TwoSumArrSolution twoNumbers = new TwoSumArrSolution();
        twoNumbers.twoNum(arr, t);
        System.out.println(Arrays.toString(twoNumbers.twoNum(arr, t)));
    }

    public int[] twoNum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
