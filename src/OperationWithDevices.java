import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OperationWithDevices {
    public static void displayAList(List<Device> deviceList) {
        deviceList.forEach(System.out::println);
    }

    public static void findById(List<Device> deviceList, String sN) throws DeviceNotFoundException {
        List<Device> collect = deviceList.stream()
                .filter(d -> String.valueOf(d.getSerialNumber()).equals(sN)).collect(Collectors.toList());
        if (collect.isEmpty())
            throw new DeviceNotFoundException("Device is not found!");
        else
            collect.forEach(System.out::println);
    }

    public static void sortedByName(List<Device> deviceList) {
        deviceList.stream().sorted(Comparator.comparing(Device::getBrand)).forEach(System.out::println);
    }

    public static void sortedByPrice(List<Device> deviceList) {
        deviceList.stream().filter(d -> d.getPrice() > 400).forEach(System.out::println);
    }

    public static void sortedByIdAndPrice(List<Device> deviceList) {
        deviceList.stream()
                .filter(d -> String.valueOf(d.getSerialNumber()).contains("0"))
                .filter(d -> d.getPrice() > 800)
                .forEach(System.out::println);
    }

}
