package main;

import main.tokenizer.Tokenizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String filePath = "example.txt";
        try {
            List<String> input = Files.readAllLines(Paths.get(filePath));
            for (String line : input) {
                var tokens = Tokenizer.tokenize(line);
                System.out.println(tokens);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}