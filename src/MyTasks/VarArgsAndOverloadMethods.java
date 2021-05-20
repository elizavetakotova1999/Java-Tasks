package MyTasks;

public class VarArgsAndOverloadMethods {
    public static void printArgCount(Object... args) {//1
        System.out.println("Object args: " + args.length);
    }

    public static void printArgCount(Integer[]... args) {//2
        System.out.println("Integer[] args: " + args.length);
    }

    public static void printArgCount(int... args) {//3
        System.out.print("int args: "
                + args.length);
    }

    public static void main(String[] args) {
        Integer[] i = {1, 2, 3, 4, 5};
        printArgCount(7, "No", true, null);
        printArgCount(i, i, i);
        printArgCount(i, 4, 71);
        printArgCount(i);//будет вызван метод 1
        //printArgCount(5, 7);
// printArgCount();//неопределенность!
    }
}
