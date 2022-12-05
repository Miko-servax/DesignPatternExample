package AbstractFactory;

public class XiaomiFactory implements Factory{
    @Override
    public Phone createPhone() {
        return new XiaomiPhone();
    }

    @Override
    public Watch createWatch() {
        return new XiaomiWatch();
    }
}
