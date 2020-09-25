package android5.task7.students;

public abstract class Task {

    protected int number;
    public int getNumber() { return number; }

    protected int moduleNumber;
    public int getModuleNumber() { return moduleNumber; }

    protected String text;
    public String getText() { return text; }

    public Task(int mn, int nu, String te) {
        moduleNumber = mn;
        number = nu;
        text = te;
    }

    public abstract void Complete();
}
