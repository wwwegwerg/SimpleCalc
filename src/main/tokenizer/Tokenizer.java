package main.tokenizer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Tokenizer {

    public static List<Token> tokenize(String input) {
        List<Token> result = new ArrayList<>();
        Matcher matcher = TokenPatterns.TOKEN_PATTERN.matcher(input);
        while (matcher.find()) {
            String s = matcher.group();
            TokenFactory.createToken(s).ifPresent(result::add);
        }
        return result;
    }

    public static void main(String[] args) {
        String expr = "(sqrt(625)+75)/10*0.1";
        List<Token> tokens = tokenize(expr);
        System.out.println(tokens);
    }
}