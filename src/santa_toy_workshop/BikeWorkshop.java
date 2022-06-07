package santa_toy_workshop;

public class BikeWorkshop extends AbstractWorkshop {
    @Override
    Bike getBike(String bikeName) {
        switch (bikeName){
            case "BMX":
                return new BMX();
            case "Pello":
                return new Pello();
            default:
                return  null;
        }
    }

    @Override
    Doll getDoll(String dollName) {
        return null;
    }
}
