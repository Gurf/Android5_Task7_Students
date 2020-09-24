package android5.task7.students;

enum Skill{
    Absent,
    Student,
    Junior,
    Middle,
    Senior
}

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

    public static int taskSolvedForAll = 0;
    public static int maxModulesClosedForAll = 0;

    public Student( String na, String sn, int ag, int gn, int ts, int mc, Skill sk ) {
        name = na;
        surname = sn;
        age = ag;
        groupNumber = gn;
        taskSolved = ts;
        modulesClosed = mc;
        skill = sk;
    }

    public Student( String na, String sn, int ag ) {
        this( na, sn, ag, 0, 0, 0, Skill.Absent);
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
}
