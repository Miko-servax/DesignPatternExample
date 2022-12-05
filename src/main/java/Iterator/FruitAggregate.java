package Iterator;

public interface FruitAggregate {

    //增删
    void addFruit(Fruit fruit);

    void deleteFruit(Fruit fruit);

    //获取迭代器
    FruitIterator getFruitIterator();

}
