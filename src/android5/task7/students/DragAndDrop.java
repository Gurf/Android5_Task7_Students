package android5.task7.students;

public class DragAndDrop extends Task implements Autochecked  {

    private String[][] answer;

    public DragAndDrop(int mn, int nu, String te) {
        super(mn,nu,te);
        answer = new String[3][5];
    }

    @Override
    public void Complete() {
        System.out.println("    DragAndDrop " + number + " задание выполняется.");
        checkAutomatically();
    }
}