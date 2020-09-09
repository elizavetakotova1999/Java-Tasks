package JavaRush;

/*
1)Как зовут кота?
Помогите коту обрести имя с помощью метода setName.
2)Напиши код в методе addNewCat, чтобы при его вызове количество котов увеличивалось на 1.
За количество котов отвечает переменная catsCount.
3)Задаем количество котов
Напишите метод setCatsCount. Метод должен устанавливать количество котов (catsCount).
4)Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильное их количество.

*/

public class Cat {
    public static int count = 0;
    //1)
    private String name = "безымянный кот";
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
        Cat cat1 = new Cat();

    //4)
        Cat.count++;
        Cat cat2 = new Cat();
        Cat.count++;

        System.out.println("The cat count is " + Cat.count);

    }
    public void setName(String name) {
        this.name = name;
    }
    //2)
    private static int catsCount = 0;

    public static void addNewCat() {
        catsCount++;
    }
    //3)
    private String fullName;
    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        Cat.this.fullName = fullName;

    }

}
