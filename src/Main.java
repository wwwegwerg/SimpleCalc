import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String filePath = "example.txt";
        try {
            List<String> input = Files.readAllLines(Paths.get(filePath));
            for (String line : input) {
                System.out.println(tokenize(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Token> tokenize(String line) {
        String[] split = line.split("\\s+"); // поменять на безпробельную реализацию
        // split[0].isEmpty() на случай, если строка только из пробелов
        if (split.length == 0 || split[0].isEmpty()) return new ArrayList<>();
        List<Token> result = new ArrayList<>();
        for (String s : split) {
            switch (s) {
                case "(", ")":
                    result.add(new Parenthesis(s.charAt(0), 0));
                    break;
                case "+", "-", "*", "/":
                    result.add(new Operation(s.charAt(0), 0));
                    break;
                default:
                    try {
                        result.add(new Number(Double.parseDouble(s), 0));
                    } catch (NumberFormatException e) {
                        throw new RuntimeException(e);
                    }
            }
        }
        return result;
    }
}