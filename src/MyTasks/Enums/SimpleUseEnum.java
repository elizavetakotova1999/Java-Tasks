package MyTasks.Enums;

enum Faculty {
    MMF, FPMI, GEO
}
public class SimpleUseEnum {
    public static void main(String args[]) {
        Faculty current;
        current = Faculty.GEO;
        switch (current) {
            case GEO:
                System.out.print(current);
                break;
            case MMF:
                System.out.print(current);
                break;
// case LAW : System.out.print(current);//ошибка компиляции!
            default:
                System.out.print("вне case: " + current);
        }
    }
}