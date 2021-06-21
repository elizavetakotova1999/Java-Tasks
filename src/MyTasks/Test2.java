package MyTasks;

public class Test2 {
    public static void main(String[] args) {
        int i = getX();
        System.out.println(i);
        boolean a = true, b = false;
        System.out.println(b);
        System.out.println("_____________");
        int x = 5*4%3;//умножение в приоритете
        System.out.println(x);
    }
    public static int getX(){
        return 10;
    }

}
