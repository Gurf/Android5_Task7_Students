package android5.task7.students;

public abstract class Person {

    protected String name;
    public String getName() {
        return name;
    }
    public void setName(String nm) { name = nm; }

    protected int age;
    public int getAge() {
        return age;
    }
    public void setAge(int ag) { age = ag; }

    public Person( String na, int ag) {
        name = na;
        age = ag;
    }

    public abstract void TellAboutYourself();
}
