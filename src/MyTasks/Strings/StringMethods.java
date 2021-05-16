package MyTasks.Strings;

import java.io.UnsupportedEncodingException;
import java.util.Formatter;

public class StringMethods {
    public static void main(String[] args) {
        String testString = "Something here";
        //CharAt() - Возвращает символ по указанному индексу (позиции)
        System.out.println("charAt(): " + testString.charAt(4));
        //codePointAt() - Возвращает Unicode символа по указанному индексу.
        System.out.println("codePointAt(): " + testString.codePointAt(3));
        //codePointBefore() - Возвращает Unicode символа перед указанным индексом
        System.out.println("codePointBefore(): " + testString.codePointBefore(6));
        //codePointCount()  - Возвращает Unicode в указанном текстовом диапазоне этой строки
        System.out.println("codePointCount(): " + testString.codePointCount(1,14));
        //compareTo() - Лексикографически сравнивает две строки
        System.out.println("compareTo(): " + testString.compareTo("Something her"));
        //compareToIgnoreCase() - Сравнивает две строки лексикографически, игнорируя различия в регистрах.
        System.out.println("compareToIgnoreCase(): "+ testString.compareToIgnoreCase("something"));
        //concat() -  Добавляет строку в конец другой строки
        System.out.println("concat(): "+ testString.concat(" or not"));
        //contains() -  Проверяет, содержит ли строка последовательность символов
        System.out.println("contains(): " + testString.contains("thing"));
        //contentEquals ()  - Проверяет, содержит ли строка точно такую же последовательность символов указанного CharSequence или StringBuffer
        System.out.println("1.contentEquals(): "+ testString.contentEquals("thing"));//false
        System.out.println("2.contentEquals(): "+ testString.contentEquals("Something here"));//true
        //copyValueOf() - Возвращает строку, представляющую символы массива символов
        char[] chars = {'V', 'e', 'r', 't', 'e', 'x', ' ', 'A', 'c', 'a', 'd', 'e', 'm', 'y'};
        String s1 = "String";
        System.out.println("String before copyValueOf: " + s1);
        s1 = s1.copyValueOf(chars);
        System.out.println("String after copyValueOf: " + s1);
        //endWith()  - Проверяет, заканчивается ли строка указанным символом(ами)
        System.out.println("endWith(): " + testString.endsWith("ere"));
        //equals() - Сравнивает две строки. Возвращает истину, если строки равны, и ложь, если нет.
        System.out.println("equals(): " + testString.equals("Something her"));
        //equalsIgnoreCase() - Сравнивает две строки, игнорируя регистр.
        System.out.println("equalsIgnoreCase(): " + testString.equals("something here"));
        //format() - Возвращает отформатированную строку с использованием указанного языкового стандарта, строки формата и аргументов.
        Formatter f = new Formatter();
        f.format("This %s is about %n%S %c", "book", "java", '8');
        System.out.print("format()/Formatter: " + f);
        //getBytes() - Кодирует эту строку в последовательность байтов с использованием названной кодировки, сохраняя результат в новый массив байтов
        try {
            System.out.println("getBytes(): " + testString.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            System.out.println("Неподдерживаемая кодировка!");
        }
        //getChars() - Копирует символы из строки в массив символов

        /*try {
            System.out.println("getChars(): " + testString.getChars(0,1,str2,0));
        } catch (Exception ex){
            System.out.println("Возникает исключение...");
        }*/

        //hashCode() - Возвращает хеш-код строки
        System.out.println("hashCode(): " + testString.hashCode());
        //indexOf() - Возвращает позицию первого найденного вхождения указанного символа в строку
        System.out.println("indexOf(): " + testString.indexOf("t"));
        //intern() -  Возвращает каноническое представление строкового объекта.
        System.out.println("intern(): " + testString.intern());
        //isEmpty() - Проверяет, пуста строка или нет.
        String s = "";
        System.out.println("isEmpty(): " + s.isEmpty());
        //lastIndexOf() -  Возвращает позицию последнего найденного вхождения указанного символа в строку.
        System.out.println("lastIndecOf(): " + testString.lastIndexOf("e"));
        //length() - Возвращает длину указанной строки.
        System.out.println("length(): " + testString.length());
        //matches() - Ищет в строке совпадение с регулярным выражением и возвращает совпадения.
        System.out.println("matches(): " + testString.matches("thing(.*)"));
        //offsetByCodePoints() -  Возвращает индекс в этой строке, который смещен от данного индекса на кодовые точки codePointOffset
        System.out.println("OffsetByCodePoints(): " + testString.offsetByCodePoints(3,9));
        //regionMatches() - Проверяет, равны ли две строковые области.
        System.out.println("regionMatches(): " + testString.regionMatches(12,"Somthing",3,12));
        //replace() - Ищет в строке указанное значение и возвращает новую строку, в которой указанные значения заменяются.
        System.out.println("replace(): " + testString.replace("r","t"));
        //replaceFirst() - Заменяет первое вхождение подстроки, которая соответствует заданному регулярному выражению, заданной заменой
        System.out.println("replaceFirst(): " + testString.replaceFirst("(.*)","Any"));
        //replaceAll() - Заменяет каждую подстроку этой строки, которая соответствует данному регулярному выражению, с данной заменой
        System.out.println("replaceAll(): " + testString.replaceAll("thing","things"));
        //split () Разбивает строку на массив подстрок
        String [] array = new String[testString.length()];
        System.out.print("split(): " );
        array = testString.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");
        }
        //startWith() - Проверяет, начинается ли строка с указанных символов
        System.out.println("startWith(): " + testString.startsWith("Some"));
        //subSequence() - Возвращает новую последовательность символов, которая является подпоследовательностью этой последовательности.
        System.out.println("subSequence(): " + testString.subSequence(0,4));
        //substring() - Извлекает символы из строки, начиная с указанной начальной позиции и до указанного количества символов.
        System.out.println("substring(): " + testString.substring(0, 4));
        //toCharArray() -  Преобразует эту строку в новый массив символов
        char[] str = new char[testString.length()];
        str = testString.toCharArray();
        System.out.println("toCharArray(): ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
        //toLowerCase() - Преобразует строку в строчные буквы
        System.out.println("toLowerCase(): " + testString.toLowerCase());
        //toString() - Возвращает значение объекта String
        int[] intArray = new int[]{1,2,3,4};
        System.out.println("toString(): " + intArray.toString());
        //toUpperCase() - Преобразует строку в буквы верхнего регистра
        System.out.println("toUpperCase(): " + testString.toUpperCase());
        //trim() - Удаляет пробелы с обоих концов строки
        System.out.println("trim(): " + testString.trim());
        //valueOf() - Возвращает строковое представление указанного значения
        Integer b = Integer.valueOf("444",16);
        System.out.println("valueOf(): " + b);

    }
}
