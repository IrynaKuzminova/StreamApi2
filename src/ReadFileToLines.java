import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFileToLines {
    public static List<String> getLinesFromFile() {
        List<String> lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("Devices.txt"));
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
