package android5.task7.students;

public abstract class Task {

    private int number;
    public int getNumber() { return number; }

    private int moduleNumber;
    public int getModuleNumber() { return moduleNumber; }

    private String text;
    public String getText() { return text; }

    public Task(int mn, int nu, String te) {
        moduleNumber = mn;
        number = nu;
        text = te;
    }

    public abstract void Complete();
}
