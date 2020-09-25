package android5.task7.students;

import java.util.Random;

public class Main {

    public static Mentor[] mentors = {
        new Mentor("Иван Распутин", 35),
        new Mentor("Марина Гольдберг", 33)
    };

    public static Student[] students = {
        new Student("Егор Авдеев", 45, Discipline.JAVA, mentors[0] ),
        new Student("Елена Вышень", 32, Discipline.PYTHON, mentors[0] ),
        new Student("Петр Кормин", 18, Discipline.UX, mentors[1] ),
        new Student("Элеонора Кадмиева", 25, Discipline.WEB, mentors[1] )
    };

    public static Task[] tasks = {
        new Test(       1, 1,  "текст задания 1"),
        new DragAndDrop(1, 2,  "текст задания 2"),
        new WriteCode(  1, 3,  "текст задания 3"),
        new Test(       1, 4,  "текст задания 4"),
        new DragAndDrop(1, 5,  "текст задания 5"),
        new WriteCode(  1, 6,  "текст задания 6"),
        new Test(       1, 7,  "текст задания 7"),
        new DragAndDrop(1, 8,  "текст задания 8"),
        new WriteCode(  1, 9,  "текст задания 9")
    };

    public static Random random = new Random();

    public static void main(String[] args) {
        for( int s=0; s<4; s++ ) {
            Student currSt = students[s];
            do {
                int taskCount = 1 + random.nextInt(8);

                System.out.println("Студент " + currSt.getName() + " пытается выполнить " + taskCount + " задач, он/она уже решил(а) " + currSt.getTaskSolved() + " задач -----------");
                currSt.SolveTasks(taskCount, tasks);
            }
            while( currSt.getAllTasksCompleted()==false );
        }
    }
}
