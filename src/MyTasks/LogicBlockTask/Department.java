package MyTasks.LogicBlockTask;


public class Department {
    {
        System.out.println("logic (1) id=" + this.id);
    }
    static {
        System.out.println("static logic");
    }
    private int id = 7;
    public Department(int d) {
        id = d;
        System.out.println("конструктор id=" + id);
    }
    int getId() {
        return id;
    }
    {
        id = 10;
        System.out.println("logic (2) id=" + id);
    }
}
