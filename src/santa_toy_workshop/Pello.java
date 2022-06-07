package santa_toy_workshop;

public class Pello implements Bike{
    String name = "Pello";
    int currentGear = 1;
    int maxGear = 4;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void Honk() {
        System.out.println("The "+name+" honks it's horn.");
    }

    @Override
    public void Break() {
        System.out.println("The "+ name +" stops in place.");
    }

    @Override
    public void Accelerate() {
        System.out.println("The "+ name +" gathers some speed.");
    }

    @Override
    public void ChangeGear(int gear) {
        if(gear>0&&gear<maxGear+1&&gear!=currentGear){
            currentGear = gear;
            System.out.println(name +" changed gear to \"Gear:"+gear+"\"");
        }
    }
}
