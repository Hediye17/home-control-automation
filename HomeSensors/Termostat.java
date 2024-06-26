package HomeSensors;

public class Termostat extends Devices {
private int tepmreture;
    public Termostat(String name) {
        super(name);
        this.tepmreture=25;
    }

    public int getTepmreture() {
        return tepmreture;
    }

    public void setTepmreture(int tepmreture) {
        this.tepmreture = tepmreture;
    }

}
