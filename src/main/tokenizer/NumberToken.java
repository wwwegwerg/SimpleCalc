package main.tokenizer;

public class NumberToken implements Token {
    public final double value;

    public NumberToken(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "NUMBER( " + value + " )";
    }

    @Override
    public TokenType getType() {
        return TokenType.NUMBER;
    }
}
