package JavaRush;

/*
Как зовут кота?
Помогите коту обрести имя с помощью метода setName.


Требования:
1. Класс Cat должен содержать только одну переменную name.
2. Переменная name должна иметь модификатор доступа private и тип String.
3. Класс Cat должен содержать только два метода setName и main.
4. Метод setName класса Cat должен устанавливать значение переменной private String name равным переданному параметру String name.
*/

public class CatName {
    private String name = "безымянный кот";

    public static void main(String[] args) {
        CatName cat = new CatName();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
