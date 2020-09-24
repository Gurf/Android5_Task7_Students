package android5.task7.students;

public class Curator extends Personnel {
    public Curator(String na, String sn, int ag) {
        super(na, sn, ag);
    }

    public void AnswerTheQuestion(){

    }

    @Override
    public void TellAboutYourself() {
        System.out.println("Рассказ о кураторе...");
    }
}