package HomeSensors;

public class Camera extends Devices{
 boolean isRecording;

    public Camera(String name) {
        super(name);
    }

    public void startRecording(){
        isRecording=true;

    }
    public void stopRecording(){
        isRecording=false;
    }
}
