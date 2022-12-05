package Listener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Boss implements Observer{

    private String name;

    @Override
    public void update() {
        System.out.println("员工增加了");
    }

    @Override
    public void increase() {
        System.out.println("员工工资增加了");
    }
}
