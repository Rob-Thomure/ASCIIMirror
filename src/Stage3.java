import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stage3 {
    public static void run() {
        System.out.println("Input the file path:");
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
