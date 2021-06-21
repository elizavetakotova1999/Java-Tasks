package MyTasks;

public class TEST <x extends String> {
    static int[] arrInstance = new int[100];

    public static void main(String[] args) {

        int _123 = 123;
        int var1 = 1;
        int $ = 6;

        boolean a = false, b = true;

        if (a){
            System.out.println("a");
        }else if (a&&b){
            System.out.println("a&&b");
        }else{ if (!b){
            System.out.println("!b");
        }else{
            System.out.println("else");
        }
        }

        System.out.println("______________________");
        int x = 1;
        Integer y = new Integer(x);
        int [] z = {x};
        m(x,y,z);
        System.out.print(x);
        System.out.print(y);
        System.out.println(z[0]);

        System.out.println("______________________");
        System.out.println(1.0*x/y);//авт приведение
        System.out.println((double)x/y);//авт приведение типов
        System.out.println("_______________________");

        String s = new String("ssssss");
        StringBuffer sb = new StringBuffer("bbbbbb");
        s.concat("-aaa");//неизменяемая строка  - но если написать String s2 = s.concat("-aaa"); - работает,
        // тогда мы присваиваем новую ссылку
        sb.append("-aaa");
        System.out.println(s);
        System.out.println(sb);

        /*class A {
            private int counter = 0;
            public static int getInstanceCount() {
                return counter;
            }
            public A() {
                counter++;
            }
        }
        public class B {
            public static void main(String ar[]) {
                A a1 = new A();
                A a2 = new A();
                A a3 = new A();
                System.out.println(A.getInstanceCount()); //1
            }
        } //Нельзя использовать в статическом методе нестатические поля класса. */

        byte[] arrLocal = new byte[100];
        for (int i = 0; i < 100; i++)
            if (arrInstance[i] != arrLocal[i]) {
                throw new IllegalStateException("error");//компиляция пройдет успешно и программа выполнится без ошибок
            }
        //При сравнении произойдет приведение типов byte -> int, а так как условие 0 != 0 всегда будет ложным,
        // то в тело if поток выполнения программы не зайдет и исключение выброшено не будет.

       // Boolean b = new Boolean("Hello");//false
        System.out.println(b);
        //Конструктор создаёт объект со значением true, только если переданная строка совпадает,
        // без учёта регистра, с "true".
        // Во всех остальных случаях создаётся объект со значением false.

        final long String = 0;
        final long Char = 0;
        final long string = 0;
        //final long byte/int/char = 0;
        final long Byte = 0;
        //ключевые слова языка Java, такие как названия примитивных типов byte и char,
        // не могут быть использованы в качестве имён переменных.
        //String, Byte, Char, не относятся к ключевым словам(т.к имена классов можно) и их разрешается использовать в качестве имён переменных.

       // int x = 0;
        System.out.print(x++ == ++x);
        //Пояснение: - сначала будет взято значение x и запомнено как левая часть выражения (т.е. 0)
        //- потом будет произведён пост-инкремент (т.е. x примет значение 1)
        //- потом выполнится пре-инкремент (т.е. x примет значение 2)
        //- и только теперь будет взято значение для правого операнда операции сравнения (т.е. 2), таким образом получаем сравнение "0 == 2".
    }

     static void m(int x, Integer y, int [] z) {
        x++;
        y++;
        z[0]++;
    }

    /* public static void main(String\u005B\u005D args) { // 2 //все ок
        char a = '\u005B'; // 3
        char c = '\u005D'; // 4
        System.out.println(a * c); // 5
    }*/

}
