import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input the file path:");
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        List<String> inputList = new ArrayList<>();
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                inputList.add(scanner.nextLine());
            }
            List<String> list = setLinesEqualSize(inputList);
            List<String> modifiedList = reverseLines(list);
            printLines(list, modifiedList);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

    }

    public static void printLines(List<String> list, List<String> modifiedList) {
        for (int i = 0; i < list.size(); i++) {
            String line = list.get(i);
            String modifiedLine = modifiedList.get(i);
            System.out.println(line + " | " + modifiedLine);
        }
    }

    public static int countLongestLine(List<String> list) {
        int longestLineSize = 0;
        for (String element : list) {
            if (element.length() > longestLineSize) {
                longestLineSize = element.length();
            }
        }
        return longestLineSize;
    }

    public static List<String> setLinesEqualSize(List<String> list) {
        int longestLineSize = countLongestLine(list);
        List<String> modifiedList = new ArrayList<>();
        for (String element : list) {
            int spaces = longestLineSize - element.length();
            modifiedList.add(element + " ".repeat(spaces));
        }
        return modifiedList;
    }



    public static List<String> reverseLines(List<String> list) {
        List<String> modifiedList = new ArrayList<>();
        for (String element : list) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < element.length(); i++) {
                stringBuilder.append(reverseAsymmetricChar(element.charAt(i)));
            }
            modifiedList.add(stringBuilder.reverse().toString());
        }
        return modifiedList;
    }

    public static char reverseAsymmetricChar(char character) {
        switch (character) {
            case '<':
                return '>';
            case '>':
                return '<';
            case '[':
                return ']';
            case ']':
                return '[';
            case '{':
                return '}';
            case '}':
                return '{';
            case '(':
                return ')';
            case ')':
                return '(';
            case '/':
                return '\\';
            case '\\':
                return '/';
            default:
                return character;

        }
    }
}