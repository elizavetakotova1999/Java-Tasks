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
        TwoSumHashMap twoSum = new TwoSumHashMap();
        twoSum.twoSumHashMap(arr, t);
        System.out.println(Arrays.toString(twoSum.twoSumHashMap(arr, t)));
    }

    public int[] twoSumHashMap(int[] nums, int target) {//Two-pass Hash Table(двухпроходная хеш-таблица)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int k = target - nums[i];
            if (map.containsKey(k) && map.get(k) != i) {
                return new int[]{i, map.get(k)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    /*
      Анализ сложности:
      Сложность по времени: O(n). Мы просматриваем список, содержащий n элементов, ровно дважды.
      Поскольку хеш-таблица сокращает время поиска до O(1), временная сложность составляет O(n).
      Сложность пространства: O(n). Требуемое дополнительное пространство зависит от количества элементов,
      хранящихся в хэш-таблице, в которой хранится ровно n элементов.*/

    public int[] twoSumOnePassHashMap(int[] nums, int target) { //One-pass Hash Table(однопроходная хеш-таблица)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
    /*
        Анализ сложности:
        Сложность по времени: O(n). Мы просматриваем список, содержащий n элементов, только один раз.
        Каждый поиск в таблице стоит только O(1) раз.
        Сложность пространства: O (n). Требуемое дополнительное пространство зависит от количества элементов,
        хранящихся в хэш-таблице, в которой хранится не более n элементов.*/
