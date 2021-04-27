package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumHashMap {
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
        Map<Integer,Integer> map = new HashMap<>();
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
