package behawioralne.memento.smart_app;

import java.util.ArrayList;
import java.util.List;

public class SmartAppCareTaker {

    private List<SmartAppMemento> mementos = new ArrayList<>();

    public void addMemento(SmartAppMemento appMemento){
        mementos.add(appMemento);
    }

    public SmartAppMemento getMemento(int index){
        return mementos.get(index);
    }
}
