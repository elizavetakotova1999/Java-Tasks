package LeetCode;
//Учитывая отсортированный массив nums, удалите дубликаты на месте,
// чтобы каждый элемент появлялся только один раз и возвращал новую длину.

//Не выделяйте дополнительное пространство для другого массива, вы должны сделать это,
// изменив входной массив на месте с помощью дополнительной памяти O(1).
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
  }
}
