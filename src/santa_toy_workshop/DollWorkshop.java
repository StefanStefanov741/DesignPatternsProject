package santa_toy_workshop;

public class DollWorkshop extends AbstractWorkshop {

    @Override
    Bike getBike(String bikeName) {
        return null;
    }

    @Override
    Doll getDoll(String dollName) {
        switch (dollName){
            case "Barbie":
                return new Barbie();
            case "Woody":
                return new Woody();
            default:
                return null;
        }
    }
}
