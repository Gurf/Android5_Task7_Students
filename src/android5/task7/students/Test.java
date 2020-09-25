package android5.task7.students;

public class Test extends Task implements Autochecked {

    private String[] answer;

    public Test(int mn, int nu, String te) {
        super(mn,nu,te);
        answer = new String[3];
    }

    @Override
    public void Complete() {
        System.out.println("    Тест выполняется.");
        checkAutomatically();
    }
}
