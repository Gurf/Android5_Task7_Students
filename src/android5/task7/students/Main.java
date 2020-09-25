package android5.task7.students;

public class Main {

    Mentor[] mentors = {
        new Mentor("Иван Распутин", 35),
        new Mentor("Марина Гольдберг", 33)
    };

    Student[] students = {
        new Student("Егор Авдеев", 45, Discipline.JAVA, mentors[0] ),
        new Student("Елена Вышень", 32, Discipline.PYTHON, mentors[0] ),
        new Student("Петр Кормин", 18, Discipline.UX, mentors[1] ),
        new Student("Элеонора Кадмиева", 25, Discipline.WEB, mentors[1] ),
    };

    public static void main(String[] args) {

    }
}
