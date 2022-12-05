package Iterator;

import java.util.List;

public class FruitIteratorImpl implements FruitIterator{

    private List<Fruit> list;
    private int position = 0;   //记录位置

    public FruitIteratorImpl(List list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Fruit next() {
        //获取指定位置元素
        Fruit fruit = list.get(position);
        position++;
        return fruit;
    }
}
