package Bridge;

//抽象沙滩类
public abstract class Beach {

    protected sea sea;

    public Beach(sea sea){
        this.sea = sea;
    }

    public void info(){
        sea.log();
    }


}
