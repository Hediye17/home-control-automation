package HomeSensors;

public class Lights extends Devices{
    boolean isbutton;


    public Lights(String name) {
        super(name);
    }

    public void LightOn(){
        isbutton=true;

    }
    public void LightOff(){
        isbutton=false;
    }

}
