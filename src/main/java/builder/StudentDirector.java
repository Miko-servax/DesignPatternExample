package builder;

public class StudentDirector {

    private StudentBuilder studentBuilder;

    public StudentDirector(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public void buildStu(){
        studentBuilder.buildName("张三");
        studentBuilder.buildGender(1);
        studentBuilder.buildCollege("摩洛哥");
        studentBuilder.buildGrade("大三");
        studentBuilder.buildAge(20);
    }

    public Student getStu(){
        return studentBuilder.getStu();
    }

}
