package santa_toy_workshop;

import java.util.ArrayList;
import java.util.List;

public class MagicalBoard implements Observable{
    private List<Observer> dwarfs;
    private String NeededToy;

    public MagicalBoard() {
        dwarfs = new ArrayList<>();
        NeededToy = "Нищо не е нужно за този момент.";
    }

    public void SetNeededТoy(String toy){
        this.NeededToy = toy;
        this.notifyObservers();
    }

    public String GetNeededToy(){
            return NeededToy;
    }

    @Override
    public void subscribe(Observer dwarf) {
        this.dwarfs.add(dwarf);
        dwarf.setObservable(this);
    }

    @Override
    public void unsubscribe(Observer dwarf) {
        this.dwarfs.remove(dwarf);
        dwarf.setObservable(null);
    }

    @Override
    public void notifyObservers() {
        for(Observer dwrf : dwarfs){
            dwrf.update();
        }
    }

    @Override
    public String getUpdate() {
        return NeededToy;
    }
}
