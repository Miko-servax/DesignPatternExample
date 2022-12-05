package builder;

import java.util.List;

public class StudentBuilderImpl extends StudentBuilder{

    @Override
    public void buildName(String name) {
        student.setName(name);
    }

    @Override
    public void buildAge(int age) {
        student.setAge(age);
    }

    @Override
    public void buildGender(int gender) {
        student.setGender(gender);
    }

    @Override
    public void buildGrade(String grade) {
        student.setGrade(grade);
    }

    @Override
    public void buildCollege(String college) {
        student.setCollege(college);
    }

    @Override
    public void buildAwards(List<String> list) {
        student.setAwards(list);
    }
}
