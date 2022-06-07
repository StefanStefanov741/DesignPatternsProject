package santa_toy_workshop;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //Setup
        SantaClaus Santa = SantaClaus.getInstance();

        Dwarf dw1 = new Dwarf("Мишо");
        Dwarf dw2 = new Dwarf("Пешо");
        Dwarf dw3 = new Dwarf("Гошо");

        MagicalBoard magicalBoard = new MagicalBoard();
        magicalBoard.subscribe(dw1);
        magicalBoard.subscribe(dw2);
        magicalBoard.subscribe(dw3);

        AbstractWorkshop bikesWorkshop = WorkshopManager.getWorkshop("Bike_Workshop");
        AbstractWorkshop dollsWorkshop = WorkshopManager.getWorkshop("Doll_Workshop");
        dw1.setBikeWorkshop(bikesWorkshop);
        dw2.setBikeWorkshop(bikesWorkshop);
        dw3.setBikeWorkshop(bikesWorkshop);
        dw1.setDollWorkshop(dollsWorkshop);
        dw2.setDollWorkshop(dollsWorkshop);
        dw3.setDollWorkshop(dollsWorkshop);
        List<String>availableBikeModels = new ArrayList<>();
        availableBikeModels.add("BMX");
        availableBikeModels.add("Pello");
        List<String>availableDollModels = new ArrayList<>();
        availableDollModels.add("Barbie");
        availableDollModels.add("Woody");
        dw1.knownBikeModels = availableBikeModels;
        dw2.knownBikeModels = availableBikeModels;
        dw3.knownBikeModels = availableBikeModels;
        dw1.knownDollModels = availableDollModels;
        dw2.knownDollModels = availableDollModels;
        dw3.knownDollModels = availableDollModels;

        OrderCommand bikesOrder = new BikesOrder(magicalBoard);
        OrderCommand dollsOrder = new DollsOrder(magicalBoard);

        //Tests
        System.out.println("****************************");
        Santa.setOrder(bikesOrder);
        Santa.MakeNewOrder();
        Santa.AddToyToBag(dw1.giveToyInHand());
        Santa.AddToyToBag(dw2.giveToyInHand());
        Santa.AddToyToBag(dw3.giveToyInHand());
        System.out.println("****************************");
        Santa.setOrder(dollsOrder);
        Santa.MakeNewOrder();
        Santa.AddToyToBag(dw1.giveToyInHand());
        Santa.AddToyToBag(dw2.giveToyInHand());
        Santa.AddToyToBag(dw3.giveToyInHand());
        System.out.println("****************************");
    }
}
