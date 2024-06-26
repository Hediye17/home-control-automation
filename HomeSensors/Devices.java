package HomeSensors;

public abstract class Devices {
    private String name;

    public Devices(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
