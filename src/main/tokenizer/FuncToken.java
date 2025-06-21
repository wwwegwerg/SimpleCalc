package main.tokenizer;

public class FuncToken implements Token {
    public final String name;

    public FuncToken(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FUNC( " + name + " )";
    }

    @Override
    public TokenType getType() {
        return TokenType.FUNCTION;
    }
}
