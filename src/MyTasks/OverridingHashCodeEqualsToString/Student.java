package MyTasks.OverridingHashCodeEqualsToString;
 //переопределение методов equals(), hashCode, toString()
public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (obj instanceof Student) {
            // вместо вышеуказанной проверки - проверка на соответствие типов сравниваемых объектов с использованием объекта класса Class
            //if (getClass() == obj.getClass())
            Student temp = (Student) obj;
            return this.id == temp.id &&
                    name.equals(temp.name) &&
                    this.age == temp.age;
        } else
            return false;
    }

    public int hashCode() {
        return (int) (31 * id + age + ((name == null) ? 0 : name.hashCode()));
    }

    public String toString() {
        return getClass().getName() + "@name" + name
                + " id:" + id + " age:" + age;
    }
}
