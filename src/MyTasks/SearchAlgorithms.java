package MyTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchAlgorithms {
    public static void main(String[] args) {
        // 1)Линейный поиск
        int index = linearSearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67);
        System.out.println("Линейный поиск:");
        print(67, index);
        // 2)Двоичный поиск
        int index2 = binarySearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67);
        System.out.println("Двоичный поиск:");
        print(67, index2);

        // 3)КМП
        String pattern = "AAABAAA";
        String text = "ASBNSAAAAAABAAAAABAAAAAGAHUHDJKDDKSHAAJF";

        List<Integer> foundIndexes = SearchAlgorithms.performKMPSearch(text, pattern);

        // 4)Поиск прыжками
        int index3 = jumpSearch(new int[]{3, 22, 27, 47, 57, 67, 89, 91, 95, 99}, 67);
        System.out.println("Поиск прыжками:");
        print(67, index3);

        // 5)Интерполяционный поиск
        int index4 = interpolationSearch(new int[]{1, 12, 23, 44, 45, 67, 87, 98}, 67);
        System.out.println("Интерполяционный поиск:");
        print(67, index4);

        // 6)Экспоненциальный поиск
        int index5 = exponentialSearch(new int[]{3, 22, 27, 47, 57, 67, 89, 91, 95, 99}, 67);
        System.out.println("Экспоненциальный поиск:");
        print(67, index5);

    }

    //Линейный поиск - Временная сложность - O(N).пространственная сложность - O(1)
    //редко используется из-за своей неэффективности
    //Линейный поиск можно использовать для малого, несортированного набора данных, который не увеличивается в размерах.
    public static int linearSearch(int array[], int elementToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

    public static void print(int elementToSearch, int index) {
        if (index == -1) {
            System.out.println(elementToSearch + " not found.");
        } else {
            System.out.println(elementToSearch + " found at index: " + index);
        }
    }

    //Двоичный поиск - Итеративный подход - O(log (N))
    //часто используется из-за быстрого времени поиска.
    //важно иметь отсортированную коллекцию при использовании двоичного поиска.
    public static int binarySearch(int arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }

    //Двоичный поиск - Рекурсивный подход.
    // Временная сложность - O(log (N)).Пространственная сложность - O(1).В худшем случае - O(log (N)).
    //Двоичный поиск реализован в методе Arrays.binarySearch Java API.
    public static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {

        // условие прекращения
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[mid] == elementToSearch)
                return mid;

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (arr[mid] > elementToSearch)
                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);

            // также, вызываем метод рекурсивно по суженным данным
            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }

        return -1;
    }

    //Алгоритм Кнута – Морриса – Пратта
    //Алгоритм КМП осуществляет поиск текста по заданному шаблону.
    //Временная сложность - O (M + N) – общее время алгоритма.Пространственная сложность - O(M).
    public static List<Integer> performKMPSearch(String text, String pattern) {
        int[] compliedPatternArray = compilePatternArray(pattern);

        int textIndex = 0;
        int patternIndex = 0;

        List<Integer> foundIndexes = new ArrayList<>();

        while (textIndex < text.length()) {
            if (pattern.charAt(patternIndex) == text.charAt(textIndex)) {
                patternIndex++;
                textIndex++;
            }
            if (patternIndex == pattern.length()) {
                foundIndexes.add(textIndex - patternIndex);
                patternIndex = compliedPatternArray[patternIndex - 1];
            } else if (textIndex < text.length() && pattern.charAt(patternIndex) != text.charAt(textIndex)) {
                if (patternIndex != 0)
                    patternIndex = compliedPatternArray[patternIndex - 1];
                else
                    textIndex = textIndex + 1;
            }
        }
        return foundIndexes;
    }

    public static int[] compilePatternArray(String pattern) {
        int patternLength = pattern.length();
        int len = 0;
        int i = 1;
        int[] compliedPatternArray = new int[patternLength];
        compliedPatternArray[0] = 0;

        while (i < patternLength) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                compliedPatternArray[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = compliedPatternArray[len - 1];
                } else {
                    compliedPatternArray[i] = len;
                    i++;
                }
            }
        }
        System.out.println("Compiled Pattern Array " + Arrays.toString(compliedPatternArray));
        return compliedPatternArray;
    }

    //Поиск прыжками
    //От двоичного поиска этот алгоритм отличает движение исключительно вперёд. Имейте в виду, что такой поиск требует отсортированной коллекции.Этот поиск используется поверх бинарного поиска, когда прыжки в обратную сторону затратны.
    //Мы прыгаем вперёд на интервал sqrt(arraylength), пока не достигнем элемента большего, чем текущий элемент или конца массива. При каждом прыжке записывается предыдущий шаг.
    //Прыжки прекращаются, когда найден элемент больше искомого. Затем запускаем линейный поиск между предыдущим и текущим шагами.
    //Это уменьшает поле поиска и делает линейный поиск жизнеспособным вариантом.
    public static int jumpSearch(int[] integers, int elementToSearch) { //Временная сложность - O(sqrt (N)).Пространственная сложность - O(1).

        int arrayLength = integers.length;
        int jumpStep = (int) Math.sqrt(integers.length);
        int previousStep = 0;

        while (integers[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
            previousStep = jumpStep;
            jumpStep += (int) (Math.sqrt(arrayLength));
            if (previousStep >= arrayLength)
                return -1;
        }
        while (integers[previousStep] < elementToSearch) {
            previousStep++;
            if (previousStep == Math.min(jumpStep, arrayLength))
                return -1;
        }

        if (integers[previousStep] == elementToSearch)
            return previousStep;
        return -1;
    }

    //Интерполяционный поиск
    //Интерполяционный поиск используется для поиска элементов в отсортированном массиве. Он полезен для равномерно распределенных в структуре данных.
    //Эффективнее применять эту формулу для больших массивов. В противном случае алгоритм работает как линейный поиск.
    //Временная сложность -  O(log log N)/O(N).Пространственная сложность - O(1).
    //Алгоритм полезно применять для равномерно распределенных данных вроде телефонной книги.
    public static int interpolationSearch(int[] integers, int elementToSearch) {

        int startIndex = 0;
        int lastIndex = (integers.length - 1);

        while ((startIndex <= lastIndex) && (elementToSearch >= integers[startIndex]) &&
                (elementToSearch <= integers[lastIndex])) {
            // используем формулу интерполяции для поиска возможной лучшей позиции для существующего элемента
            int pos = startIndex + (((lastIndex - startIndex) /
                    (integers[lastIndex] - integers[startIndex])) *
                    (elementToSearch - integers[startIndex]));

            if (integers[pos] == elementToSearch)
                return pos;

            if (integers[pos] < elementToSearch)
                startIndex = pos + 1;

            else
                lastIndex = pos - 1;
        }
        return -1;
    }

    //Экспоненциальный поиск
    //Используется для поиска элементов путём перехода в экспоненциальные позиции, то есть во вторую степень.
    //В этом поиске мы пытаемся найти сравнительно меньший диапазон и применяем на нем двоичный алгоритм для поиска элемента.
    //Для работы алгоритма коллекция должна быть отсортирована.
    //Временная сложность - O(log (N)).Пространственная сложность - O(1). Для рекурсивного двоичного поиска пространственная сложность становится равной O(log (N)).
    //Экспоненциальный поиск используется с большими массивами, когда бинарный поиск затратен. Экспоненциальный поиск разделяет данные на более доступные для поиска разделы.
    public static int exponentialSearch(int[] integers, int elementToSearch) {

        if (integers[0] == elementToSearch)
            return 0;
        if (integers[integers.length - 1] == elementToSearch)
            return integers.length;

        int range = 1;

        while (range < integers.length && integers[range] <= elementToSearch) {
            range = range * 2;
        }

        return Arrays.binarySearch(integers, range / 2, Math.min(range, integers.length), elementToSearch);
    }

}
