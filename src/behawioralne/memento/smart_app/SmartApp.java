package behawioralne.memento.smart_app;

public class SmartApp {

    private double version;

    public void changeVersion(Double version){
        this.version = version;
        System.out.println("New version : " + version);
    }

    public SmartAppMemento save(){
        return new SmartAppMemento(this.version);
    }

    public void load(SmartAppMemento smartAppMemento){
        this.version = smartAppMemento.getVersion();
    }
}
