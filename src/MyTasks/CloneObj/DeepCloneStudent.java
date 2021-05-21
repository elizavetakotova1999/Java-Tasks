package MyTasks.CloneObj;

import java.util.ArrayList;

public class DeepCloneStudent<Mark> implements Cloneable {
    private int id = 71;
    private ArrayList<Mark> lm = new ArrayList<Mark>();
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ArrayList<Mark> getMark() {
        return lm;
    }
    public void setMark(ArrayList<Mark> lm) {
        this.lm = lm;
    }
    public Object clone() {
        try {
            DeepCloneStudent copy =(DeepCloneStudent)super.clone();
            copy.lm = (ArrayList<Mark>)lm.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(
                    "отсутствует Cloneable!");
        }
    }
}
