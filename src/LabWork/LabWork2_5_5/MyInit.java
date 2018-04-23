package LabWork.LabWork2_5_5;

public class MyInit {
    static private int nextid;

    static {
        nextid = (int) (1000 * Math.random());
    }

    private int id;

    {
        nextid++;
        setId(nextid);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
