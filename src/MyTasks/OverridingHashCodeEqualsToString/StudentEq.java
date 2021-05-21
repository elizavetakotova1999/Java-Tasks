package MyTasks.OverridingHashCodeEqualsToString;

public class StudentEq {
    public static void main(String[] args) {
        Student p1 = new Student(71, "Петров", 19);
        Student p2 = new Student(71, "Петров", 19);
        SubStudent p3 = new SubStudent(71, "Петров", 19, 5);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p3.equals(p1));
    }
}
