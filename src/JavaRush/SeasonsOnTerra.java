package JavaRush;
//Напишите метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
//        Пример для номера месяца 2:
//        зима
//        Пример для номера месяца 5:
//        весна

public class SeasonsOnTerra {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        String s = "";
        switch (month) {
            case 12:
            case 1:
            case 2:
                s = "зима";
                break;
            case 3:
            case 4:
            case 5:
                s = "весна";
                break;
            case 6:
            case 7:
            case 8:
                s = "лето";
                break;
            case 9:
            case 10:
            case 11:
                s = "осень";
                break;
            default:
        }
        System.out.println(s);
    }
}