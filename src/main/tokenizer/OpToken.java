package main.tokenizer;

public class OpToken implements Token {
    public final String op;

    public OpToken(String op) {
        this.op = op;
    }

    @Override
    public String toString() {
        return "OP( " + op + " )";
    }

    @Override
    public TokenType getType() {
        return TokenType.OPERATOR;
    }
}
