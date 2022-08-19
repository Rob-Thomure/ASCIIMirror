import java.util.Scanner;

public class FilePath {
    private static final String ASCII_COW = "" +
            "            ^__^\n" +
            "    _______/(oo)\n" +
            "/\\/(       /(__)\n" +
            "   | w----||    \n" +
            "   ||     ||    ";


    public static void executeFilePath() {
        System.out.println("Input the file path:");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        System.out.println(filePath);
        System.out.println(ASCII_COW);
    }
}
