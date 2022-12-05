package builder;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class main {

    @Test
    public void main(){
        StudentBuilderImpl studentBuilder = new StudentBuilderImpl();
        StudentDirector studentDirector = new StudentDirector(studentBuilder);
        studentDirector.buildStu();
        Student stu = studentDirector.getStu();
        log.info(stu.toString());
    }

}
