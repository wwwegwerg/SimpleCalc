package main.tokenizer;

public class CommaToken implements Token {
    @Override
    public String toString() {
        return "COMMA";
    }

    @Override
    public TokenType getType() {
        return TokenType.COMMA;
    }
}
