package android5.task7.students;

public class Test extends Task implements Autochecked {

    public Test(int mn) {
        super(mn);
    }

    public void Complete() {
        System.out.println("Тест завершен.");
    }

    @Override
    public void checkAutomatically() {
        System.out.println("Тут происходит автоматическая проверка.");
    }
}
