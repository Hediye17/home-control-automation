package HomeSensors;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HomeControle controle=new HomeControle();

        controle.addDevices(new Camera("Security camera"));
        controle.addDevices(new Lights("Lambs"));
        controle.addDevices(new Termostat("Thermostat"));
        controle.addDevices(new SprinklerSystem("Garden irrigation system"));

        while (true){
            System.out.println("wellcome to Home Control System");
            System.out.println("1=> Security Camera");
            System.out.println("2=> Light Control");//her bir oda için ayrı yap
            System.out.println("3=> Thermostat control");
            System.out.println("4=> Garden Irrigation System");
            System.out.println("Please make your choice.");
            int choice=scanner.nextInt();

                switch (choice){

                    case 1:
                        System.out.println("Security camera is being checked.");
                        Camera camera=(Camera) controle.getDeviceByName("Security camera");
                            System.out.println("1=> Start recording camera");
                            System.out.println("2=> Stop recording camera");

                        int camChoice = scanner.nextInt();
                            if (camChoice == 1) {
                                camera.startRecording();
                                System.out.println("Camera started recordinf");
                            } else if (camChoice == 2) {
                                camera.stopRecording();
                                System.out.println("Camera stopped recording");
                            }
                             else {
                            System.out.println("Security camera not found.");  }
                        break;

                    case 2:
                        System.out.println("Checking the light.");
                        Lights lights=(Lights) controle.getDeviceByName("Lambs");
                        System.out.println("1=> Light on");
                        System.out.println("2=> Light off");
                        int lightChoice=scanner.nextInt();
                        if(lightChoice==1){
                            lights.LightOn();
                            System.out.println("Lamp turned on");
                        }
                        else if (lightChoice==2) {
                            lights.LightOff();
                            System.out.println("Lamp turned off");

                        }
                        else {
                            System.out.println("Lamp not found.");
                        }
                        break;

                    case 3:
                        Termostat thermostat=(Termostat) controle.getDeviceByName("Thermostat");
                        System.out.println("1=> Thermostat screen");
                        System.out.println("2=> Change the temperature");
                        int thermostatChoice= scanner.nextInt();
                        if (thermostatChoice==1){
                            System.out.println("Home temperature average "+thermostat.getTepmreture()+" degre");
                        }
                        else if (thermostatChoice==2) {
                            thermostat.setTepmreture(30);
                            System.out.println("House temperture set to "+thermostat.getTepmreture() +" degree.");
                        }
                        else {
                            System.out.println("Thermostat not found");
                        }
                        break;


                    case 4:
                        SprinklerSystem sprink=(SprinklerSystem) controle.getDeviceByName("Garden irrigation system");
                        System.out.println("1=> Garden irrigation system on");
                        System.out.println("2=> Garden irrigation system off");
                        int sprinkChoice= scanner.nextInt();
                        if (sprinkChoice==1){
                            sprink.SprinklerOn();
                            System.out.println("Garden irrigation system turn on");
                        }
                        else if (sprinkChoice==2) {
                            sprink.Sprinkleroff();
                            System.out.println("Garden irrigation system turn of");
                        }
                        else {
                            System.out.println("Garden irrigation system not found");
                        }
                }


            break;
        }

    }
}
