package MyTasks;

public class Quest3 {
    Quest3(int i) {
        System.out.print("Конструктор");
    }

    public static void main(String[] args) {
        Quest3 s = new Quest3();
//1

    }

    public Quest3() {
//2

    }

    {
//3
        // new Quest3(1);//Exception in thread "main" java.lang.StackOverflowError
    }
}
