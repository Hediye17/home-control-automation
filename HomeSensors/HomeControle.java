package HomeSensors;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class HomeControle {

    private List<Devices>homeDevices;

    public HomeControle(){
        this.homeDevices= new ArrayList<>();
    }
    public void addDevices(Devices Devices){
        homeDevices.add(Devices) ;
         }

    public Devices getDeviceByName(String name) {
        for (Devices device : homeDevices) {
            if (device.getName().equals(name)) {
                return device;
            }
        }
        return null;
    }

}
