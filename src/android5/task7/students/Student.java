package android5.task7.students;

import java.util.Objects;

public class Student extends Person {

    public static final int MAX_MODULE_COUNT = 20;

    private int groupNumber;
    public int getGroupNumber() {
        return groupNumber;
    }

    private int taskSolved;
    public int getTaskSolved() {
        return taskSolved;
    }

    private int modulesClosed;
    public int getModulesClosed() {
        return modulesClosed;
    }

    private Skill skill;
    public Skill getSkill() {
        return skill;
    }

    private Discipline discipline;
    public  Discipline getDiscipline() {
        return discipline;
    }

    public static int taskSolvedForAll = 0;
    public static int maxModulesClosedForAll = 0;

    public Student( String na, int ag, int gn, int ts, int mc, Skill sk, Discipline di ) {
        super( na, ag);
        groupNumber = gn;
        taskSolved = ts;
        modulesClosed = mc;
        skill = sk;
        discipline = di;
    }

    public Student( String na, int ag ) {
        this( na, ag, 0, 0, 0, Skill.ABSENT, Discipline.JAVA);
    }

    public void solveTask() {
        System.out.println("Задание решено !");
        taskSolved++;
        taskSolvedForAll++;
    }

    public void closeModule() {
        if( modulesClosed < MAX_MODULE_COUNT ) {
            modulesClosed++;
            if (maxModulesClosedForAll < modulesClosed) {
                maxModulesClosedForAll = modulesClosed;
            }
            System.out.println("Модуль пройден !");
        }
        else {
            System.out.println("Все модули пройдены !");
        }
    }

    @Override
    public void TellAboutYourself() {
        System.out.println("рассказ о студенте...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return
                name.equals(student.name) &&
                age == student.age &&
                skill == student.skill &&
                discipline == student.discipline;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, skill, discipline);
    }

    @Override
    public String toString() {
        return "Student { " +
                "  name='" + name + '\'' +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                ", taskSolved=" + taskSolved +
                ", modulesClosed=" + modulesClosed +
                ", skill=" + skill +
                ", discipline='" + discipline + "'" +
                " } ";
    }
}
