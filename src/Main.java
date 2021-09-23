import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> linesFromFile = ReadFileToLines.getLinesFromFile();
        List<Device> devices = WriteFromLinesToObject.getDevices(linesFromFile);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть пункт:" +
                "\n1.Вивести весь список." +
                "\n2.Шукати девайс за ІД." +
                "\n3.Вивести посортований список за назвою бренду." +
                "\n4.Вивести девайси у яких ціна більше 400." +
                "\n5.Вивести девайси у яких в ІД є '0' та ціна більшу 800.");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1: {
                OperationWithDevices.displayAList(devices);
                break;
            }
            case 2: {
                System.out.println("Введіть ІД:");
                String ID = scanner.next();
                try {
                    OperationWithDevices.findById(devices, ID);
                } catch (DeviceNotFoundException e) {
                    System.out.println("За таким ІД девайсу не має!");
                    ;
                }
                break;
            }
            case 3: {
                OperationWithDevices.sortedByName(devices);
                break;
            }
            case 4: {
                OperationWithDevices.sortedByPrice(devices);
                break;
            }
            case 5: {
                OperationWithDevices.sortedByIdAndPrice(devices);
                break;
            }
            default:
                System.out.println("Ви ввели не вірну операцію!");
                break;
        }

    }
}
