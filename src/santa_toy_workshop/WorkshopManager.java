package santa_toy_workshop;

public class WorkshopManager {
    public  static AbstractWorkshop getWorkshop(String workshopName){
        switch (workshopName){
            case "Bike_Workshop": return new BikeWorkshop();
            case "Doll_Workshop": return new DollWorkshop();
            default: return null;
        }
    }
}
