package android5.task7.students;

public abstract class Task {

    private int moduleNumber;
    public int getModuleNumber() { return moduleNumber; }

    public Task(int mn) {
        moduleNumber = mn;
    }

    public abstract void Complete();
}
