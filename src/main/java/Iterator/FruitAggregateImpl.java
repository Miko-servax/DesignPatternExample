package Iterator;

import java.util.ArrayList;
import java.util.List;

public class FruitAggregateImpl implements FruitAggregate{

    private List<Fruit> list = new ArrayList<Fruit>();

    @Override
    public void addFruit(Fruit fruit) {
        list.add(fruit);
    }

    @Override
    public void deleteFruit(Fruit fruit) {
        list.remove(fruit);
    }

    @Override
    public FruitIterator getFruitIterator() {
        return new FruitIteratorImpl(list);
    }
}
