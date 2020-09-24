package android5.task7.students;

public class Person {

    protected String name;
    public String getName() {
        return name;
    }

    protected String surname;
    public String getSurname() {
        return surname;
    }

    protected int age;
    public int getAge() {
        return age;
    }

    public Person( String na, String sn, int ag) {
        name = na;
        surname = sn;
        age = ag;
    }

}
