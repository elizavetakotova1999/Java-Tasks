package LeetCode;
//Нужно найти самый длинный общий префикс в элементах массива
public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strings = new String[]{"flyyyyower", "flyyyyow", "flyyyyyight"};

        System.out.println(longestCommonPrefix.longestCommonPrefix(strings));

    }

    public String longestCommonPrefix(String[] strs) {
        //Вариант решения 2.
        if(strs.length == 0) return "";

        String prefix = strs[0];//изначально префикс равен первой строке
        for(int i=1; i<strs.length; i++){//начиная со второй строки
            while(strs[i].indexOf(prefix)!=0){// пока искомый префикс не равен нулю сравниваем префикс с остальными строками
                prefix = prefix.substring(0, prefix.length()-1);//присваивая префиксу полученную подстроку()
            }
        }
        return prefix;
    

        /*
        //Вариант решения 1.
        if (strs.length == 0) return "";
        int find_length = strs[0].length();//искомая длина префикса изначально равна длине первого слова.
        // Все строки будем сравнивать с первым сокращая длину до того пока не найдем общий префикс.
        for (int i = 0; i < strs.length; i++) {
            find_length = Math.min(find_length, strs[i].length());//записываем найменшее значение длины двух строк
            for (int j = 0; j < find_length; j++) {
                char first = strs[0].charAt(j);//элемент j первой строки данного массива
                char last = strs[i].charAt(j);//элемент j строки i данного массива
                if (first != last) {//если элементы первой и следующей строки не равны
                    find_length = j;//то искомой длине префикса присваиваем j
                    break;//выходим из цикла
                }
            }
        }
        return strs[0].substring(0, find_length);*/
    }

}

