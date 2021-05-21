package MyTasks.OverridingHashCodeEqualsToString;

public class SubStudent extends Student {
    private int idFaculty;

    public SubStudent(int id, String n, int a, int idf) {
        super(id, n, a);
        this.idFaculty = idf;
    }
}
