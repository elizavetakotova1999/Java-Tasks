package Stepik.Java.BasicCourse;

/*
В Григорианском календаре год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100,
либо кратен 400.Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года) до
заданного года включительно. На самом деле Григорианский календарь был введен значительно позже, но здесь для
упрощения мы распространяем его действие на всю нашу эру.
*/
public class NumOfLeapYears {
    public static void main(String[] args) {
        System.out.println(leapYearCount(2020));
    }

    public static int leapYearCount(int year) {

        return (year / 4) - (year / 100) + (year / 400);

    }

}
