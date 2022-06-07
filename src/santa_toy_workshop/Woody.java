package santa_toy_workshop;

public class Woody implements Doll {
    String name = "Woody";

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
