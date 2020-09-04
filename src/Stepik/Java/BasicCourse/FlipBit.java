package Stepik.Java.BasicCourse;

//Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.

public class FlipBit {
    public static void main(String[] args) {
        System.out.println(flipBit(13, 2));
    }

    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value    any number
     * @param bitIndex index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {

        return value ^ (1 << bitIndex - 1);
    }
}
