package android5.task7.students;

import java.util.Objects;

public class Student extends Person {

    public static final int MAX_MODULE_COUNT = 20;

    private int groupNumber;
    public int  getGroupNumber() {
        return groupNumber;
    }
    public void setGroupNumber(int gn) {
        groupNumber = gn;
    }

    private int taskSolved;
    public int getTaskSolved() {
        return taskSolved;
    }
    public void setTaskSolved(int ts) {
        taskSolved = ts;
    }

    private int modulesClosed;
    public  int getModulesClosed() {
        return modulesClosed;
    }
    public  void setModulesClosed(int mc) {
        modulesClosed = mc;
    }

    private Skill skill;
    public  Skill getSkill() {
        return skill;
    }
    public  void setSkill(Skill sk) {
        skill = sk;
    }

    private Discipline discipline;
    public  Discipline getDiscipline() {
        return discipline;
    }
    public  void setDiscipline(Discipline ds) {
        discipline = ds;
    }

    public static int taskSolvedForAll = 0;
    public static int maxModulesClosedForAll = 0;

    private Mentor mentor;
    public  Mentor getMentor() {
        return mentor;
    }
    public  void setMentor(Mentor mn) {
        mentor = mn;
    }

    public boolean allTasksCompleted = false;
    public boolean getAllTasksCompleted() {
        return allTasksCompleted;
    }
    public void setAllTasksCompleted(boolean atc) {
        allTasksCompleted = atc;
    }

    public Student( String na, int ag, int gn, int ts, int mc, Skill sk, Discipline di, Mentor me) {
        super( na, ag);
        groupNumber = gn;
        taskSolved = ts;
        modulesClosed = mc;
        skill = sk;
        discipline = di;
    }

    public Student( String na, int ag, Mentor me ) {
        this( na, ag, 0, 0, 0, Skill.ABSENT, Discipline.JAVA, me);
    }

    private void solveOneTask(Task ts) {
        System.out.println("Начинаем выполнение задания");

        ts.Complete();
        if( ts instanceof Autochecked )
            ((Autochecked) ts).checkAutomatically();
        else {
            boolean notChecked = true;
            do {
                notChecked = !(mentor.CheckTheTask(ts));
            } while ( notChecked );
        }
        taskSolved++;
        taskSolvedForAll++;
        System.out.println("Заканчиваем выполнение задания");
    }

    private void CheckAllTaskSolved(int len)
    {
        if( taskSolved>=len ) {
            allTasksCompleted = true;
            System.out.println("Все Задачи решены !");
        }
    }

    public void SolveTasks(int tc, Task[] tasks) {

        int len;
        if( taskSolved+tc > tasks.length )
            len = tasks.length;
        else
            len = taskSolved+tc;

        for( int i=taskSolved; i<len; i++ ) {
            Task currTask = tasks[i];
            solveOneTask( currTask );
        }

        CheckAllTaskSolved(tasks.length);
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
