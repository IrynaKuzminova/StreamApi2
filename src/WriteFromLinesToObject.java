import java.util.ArrayList;
import java.util.List;

public class WriteFromLinesToObject {
    public static List<Device> getDevices(List<String> lines) {
        List<Device> devices = new ArrayList<>();
        for (String line : lines) {
            String[] split = line.split(", ");
            String deviceId = split[0];
            String brandDevice = split[1];
            String infoDevice = split[2];
            String priceDevice = split[3];
            devices.add(new Device(Long.parseLong(deviceId), brandDevice, infoDevice, Integer.parseInt(priceDevice)));
        }
        return devices;
    }
}
