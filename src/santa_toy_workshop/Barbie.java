package santa_toy_workshop;

public class Barbie implements Doll{
    String name = "Barbie";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void Talk() {
        System.out.println(name+": "+"Hello, my name is "+name+", what is your name?");
    }

    @Override
    public void MoveEyes() {
        System.out.println(name+" looks around.");
    }

    @Override
    public void MoveLegs() {
        System.out.println(name+" starts walking.");
    }

    @Override
    public void MoveArms() {
        System.out.println(name+" moves her arms animatedly.");
    }
}
