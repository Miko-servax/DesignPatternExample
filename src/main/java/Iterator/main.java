package Iterator;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class main {

    @Test
    public void main(){
        FruitAggregateImpl fruitAggregate = new FruitAggregateImpl();
        Fruit fruit1 = new Fruit("水果1号", 12);
        Fruit fruit2 = new Fruit("水果2号", 24);
        Fruit fruit3 = new Fruit("水果3号", 50);

        fruitAggregate.addFruit(fruit1);
        fruitAggregate.addFruit(fruit2);
        fruitAggregate.addFruit(fruit3);
        FruitIterator fruitIterator = fruitAggregate.getFruitIterator();
        while (fruitIterator.hasNext()){
            Fruit fruit = fruitIterator.next();
            fruit.toString();
        }

    }

}
