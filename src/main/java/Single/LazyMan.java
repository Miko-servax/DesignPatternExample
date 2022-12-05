package Single;

import org.junit.Test;

public class LazyMan {

    //构造器私有
    private LazyMan(){
        System.out.println(Thread.currentThread().getName() + "OK");
    }

    private volatile static LazyMan lazyman;

    //双重检测锁模式（DCL懒汉式）
    public static LazyMan getInstance(){
        if (lazyman == null){
            synchronized (LazyMan.class){
                if (lazyman == null){
                    lazyman = new LazyMan();
                }
            }
        }
        return lazyman;
    }

    // @Test
    // public void test(){
    //     for (int i = 0;i<10;i++){
    //         new Thread(()->{
    //             LazyMan.getInstance();
    //         }).start();
    //     }
    // }

    public static void main(String[] args) {
        for (int i = 0;i<10;i++){
            new Thread(()->{
                LazyMan.getInstance();
            }).start();
        }
    }

}
