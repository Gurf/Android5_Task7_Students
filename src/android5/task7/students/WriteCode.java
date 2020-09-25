package android5.task7.students;

public class WriteCode extends Task {

    private String answer;

    public WriteCode(int mn, int nu, String te) {
        super(mn,nu,te);
        answer = new String();
    }

    @Override
    public void Complete() {
        System.out.println("    Задание " + number + " написать код выполняется.");
    }
}