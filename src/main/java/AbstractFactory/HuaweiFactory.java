package AbstractFactory;

public class HuaweiFactory implements Factory{
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Watch createWatch() {
        return new HuaweiWatch();
    }
}
