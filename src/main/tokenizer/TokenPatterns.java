package main.tokenizer;

import java.util.List;
import java.util.regex.Pattern;

final class TokenPatterns {
    public static final Pattern NUMBER = Pattern.compile("[0-9]+(\\.[0-9]+)?");
    public static final Pattern OPERATOR = Pattern.compile("[+\\-*/^]");
    public static final Pattern PARENTHESE = Pattern.compile("[()]");
    public static final Pattern COMMA = Pattern.compile(",");
    public static final Pattern WHITESPACE = Pattern.compile("\\s+");
    public static final Pattern MISMATCH = Pattern.compile(".");
    private static final List<String> MATH_FUNCS = List.of("log", "sqrt", "rt", "sin", "cos", "tg", "ctg");
    public static final Pattern FUNCTION = Pattern.compile("(" + String.join("|", MATH_FUNCS) + ")");
    public static final Pattern TOKEN_PATTERN = Pattern.compile(String.join("|", FUNCTION.pattern(), NUMBER.pattern(), OPERATOR.pattern(), PARENTHESE.pattern(), COMMA.pattern(), WHITESPACE.pattern(), MISMATCH.pattern()));

    private TokenPatterns() {
    }
}
