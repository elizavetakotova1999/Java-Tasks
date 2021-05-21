package MyTasks.CloneObj;

// безопасная передача по ссылке
public class DemoSimpleClone {
    private static void changeId(Student p) {
        p = (Student) p.clone();//клонирование
        p.setId(1000);
        System.out.println("->id = " + p.getId());
    }

    public static void main(String[] args) {
        Student ob = new Student();
        System.out.println("id = " + ob.getId());
        changeId(ob);
        System.out.println("id = " + ob.getId());
    }
}
/* Если закомментировать вызов метода clone(),
    то выведено будет следующее:
    id = 71
    ->id = 1000
    id = 1000*/
