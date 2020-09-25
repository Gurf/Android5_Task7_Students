package android5.task7.students;

public interface Autochecked {
    default void checkAutomatically() {
        System.out.println("    Тут происходит автоматическая проверка.");
    }
}
