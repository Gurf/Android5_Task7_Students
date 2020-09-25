package android5.task7.students;

public abstract class Staff extends Person {

    private int supervisedGroupNumber;
    public int getSupervisedGroupNumber() {
        return supervisedGroupNumber;
    }

    protected String workPlace;
    public String getWorkPlace() {
        return workPlace;
    }

    public Staff(String na, int ag) {
        super(na, ag);
    }

    public void HelpToStudent(Student st) {

    }

    public void Encourage() {

    }

    public void ShareUsefulInformation() {
        System.out.println("Читайте https://habr.com/ru/search/?q=[java]");
    }

    @Override
    public abstract void TellAboutYourself();
}
