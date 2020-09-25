package android5.task7.students;

public class DragAndDrop extends Task implements Autochecked  {

    public DragAndDrop(int mn) {
        super(mn);
    }

    @Override
    public void Complete() {
        System.out.println("    DragAndDrop задание выполняется.");
    }

    @Override
    public void checkAutomatically() {
        System.out.println("    Тут происходит автоматическая проверка.");
    }
}