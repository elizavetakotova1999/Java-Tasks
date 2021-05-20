package MyTasks.Enums;

enum Dean {
    MMF("Бендер"), FPMI("Балаганов"), GEO("Козлевич");
    String name;
    Dean(String arg) {
        name = arg;
    }
    String getName() {
        return name;
    }
}