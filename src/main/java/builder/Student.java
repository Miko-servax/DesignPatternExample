package builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String name;
    private int age;
    private int gender;
    private String grade;
    private String college;
    private List<String> awards;

}
