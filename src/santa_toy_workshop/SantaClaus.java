package santa_toy_workshop;

import java.util.ArrayList;
import java.util.List;

public class SantaClaus{
    private static SantaClaus instance;
    private OrderCommand order;
    private List<Object>ToysInTheBag;

    private SantaClaus(){
        ToysInTheBag = new ArrayList<>();
    }

    public static SantaClaus getInstance(){

        if(instance == null){
            instance = new SantaClaus();
        }

        return instance;
    }

    public void setOrder(OrderCommand cmd){
        order = cmd;
    }

    public void MakeNewOrder(){
        if(order instanceof BikesOrder){
            System.out.println("Дядо Коледа: Трябват ми колелета.");
        }else if(order instanceof DollsOrder){
            System.out.println("Дядо Коледа: Трябват ми кукли.");
        }
        order.MakeOrder();
    }

    public void AddToyToBag(Object toy){
        if(toy!=null){
            System.out.println("Дядо Коледа слага "+((Toy) toy).getName()+" в торбата си.");
            ToysInTheBag.add(toy);
        }
    }

    public Object GetToyFromBag(){
        if(ToysInTheBag.size()>0){
            Object toGive = ToysInTheBag.get(0);
            ToysInTheBag.remove(0);
            System.out.println("Дядо коледа изважда играчка от торбата си. ("+((Toy) toGive).getName()+")");
            return  toGive;
        }else{
            System.out.println("Дядо Коледа: Изглежда торбата ми е празна.");
            return null;
        }
    }

}
