package android5.task7.students;

public class Mentor extends Staff {

    public Mentor(String na, int ag) {
        super(na, ag);
    }

    public boolean CheckTheTask(Task ts) {
        System.out.println("    Ментор проверяет задачу.");
        return true;
    }

    public void HoldTheMeeting() {
        System.out.println("Проводится совещание.");
    }

    @Override
    public void TellAboutYourself() {
        System.out.println("Рассказ о менторе...");
    }
}
