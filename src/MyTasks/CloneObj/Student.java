package MyTasks.CloneObj;

//класс, поддерживающий клонирование
public class Student implements Cloneable {//включениеинтерфейса
    private int id = 71;
    public int getId() {
        return id;
    }
    public void setId(int value) {
        id = value;
    }
    public Object clone() {//переопределение метода
        try {
            return super.clone();//вызов базового метода
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("невозможно!");
        }
    }
}
