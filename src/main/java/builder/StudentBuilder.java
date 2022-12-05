package builder;

import java.util.List;

public abstract class StudentBuilder {

    protected Student student;

    public StudentBuilder(){
        this.student = new Student();
    }

    public Student getStu(){
        return student;
    }

    public abstract void buildName(String name);
    public abstract void buildAge(int age);
    public abstract void buildGender(int gender);
    public abstract void buildGrade(String grade);
    public abstract void buildCollege(String college);
    public abstract void buildAwards(List<String> list);


}
