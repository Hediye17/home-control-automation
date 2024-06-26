package HomeSensors;

public class SprinklerSystem extends Devices{
    boolean isSprinkler;
    public SprinklerSystem(String name) {
        super(name);
    }
    public void SprinklerOn (){
        isSprinkler=true;
    }

    public void Sprinkleroff(){
        isSprinkler=false;
    }



}
