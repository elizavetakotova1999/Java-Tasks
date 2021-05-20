package MyTasks;

public class RuntimeTask {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Полный объем памяти: "
                + rt.totalMemory());
        System.out.println("Свободная память: "
                + rt.freeMemory());
        double d[] = new double[10000];
        System.out.println("Свободная память после" +
                " объявления массива: " + rt.freeMemory());
//инициализация процесса
        ProcessBuilder pb =
                new ProcessBuilder("mspaint", "c:\\temp\\cow.gif");
        try {
            pb.start(); // запуск mspaint.exe
        } catch (java.io.IOException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Свободная память после "
                + "запуска mspaint.exe: " + rt.freeMemory());
        System.out.println("Список команд: "
                + pb.command());
    }
}
