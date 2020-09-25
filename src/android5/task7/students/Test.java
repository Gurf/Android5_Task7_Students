package android5.task7.students;

public class Test extends Task implements Autochecked {

    public Test(int mn) {
        super(mn);
    }

    @Override
    public void Complete() {
        System.out.println("    Тест выполняется.");
    }

    @Override
    public void checkAutomatically() {
        System.out.println("    Тут происходит автоматическая проверка.");
    }
}
