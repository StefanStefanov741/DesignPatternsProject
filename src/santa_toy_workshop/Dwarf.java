package santa_toy_workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dwarf implements Observer{
    private String name;
    private Observable magic_board;
    private AbstractWorkshop bikeWorkshop;
    private AbstractWorkshop dollWorkshop;
    public List<String> knownBikeModels;
    public List<String> knownDollModels;
    private Object toyInHand;

    public Dwarf(String name) {
        this.name = name;
        knownBikeModels = new ArrayList<>();
        knownDollModels = new ArrayList<>();
    }

    public void setBikeWorkshop(AbstractWorkshop bw){
        this.bikeWorkshop = bw;
    }

    public void setDollWorkshop(AbstractWorkshop dw){
        this.dollWorkshop = dw;
    }

    @Override
    public void update() {
        if(this.magic_board ==null){
            System.out.println(this.name+" не следи дъската.");
            return;
        }
        String neededToy = this.magic_board.getUpdate();
        if(neededToy=="Колело"){
            if(bikeWorkshop!=null){
                if(knownBikeModels.size()>0){
                    String bikeModel = knownBikeModels.get(new Random().nextInt(knownBikeModels.size()));
                    toyInHand = bikeWorkshop.getBike(bikeModel);
                    System.out.println(this.name + " държи колело "+((Bike)toyInHand).getName()+" в ръце.");
                }else{
                    System.out.println(this.name + " не може да избере колело, защото не знае от кои модели колелета може да избере.");
                }
            }else{
                System.out.println(this.name + " не знае къде се намира работилницата за колела.");
            }
        }else if(neededToy=="Кукла"){
            if(dollWorkshop!=null){
                if(knownDollModels.size()>0){
                    String dollModel = knownDollModels.get(new Random().nextInt(knownDollModels.size()));
                    toyInHand = dollWorkshop.getDoll(dollModel);
                    System.out.println(this.name + " държи кукла "+((Doll)toyInHand).getName()+" в ръка.");
                }else{
                    System.out.println(this.name + " не може да избере кукла, защото не знае от кои модели кукли може да избере.");
                }
            }else{
                System.out.println(this.name + " не знае къде се намира работилницата за кукли.");
            }
        }else{
            System.out.println(this.name+" не разпознава желаната играчка ("+neededToy+")");
        }
    }

    @Override
    public void setObservable(Observable observable) {
        magic_board = observable;
    }

    public Object giveToyInHand(){
        if(toyInHand!=null){
            Object toGive = toyInHand;
            toyInHand=null;
            System.out.println(this.name + " подава "+((Toy)toGive).getName()+".");
            return  toGive;
        }else{
            return null;
        }
    }
}
