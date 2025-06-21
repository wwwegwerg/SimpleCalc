package main.tokenizer;

public class ParenToken implements Token {
    public final String paren; // "(" or ")"

    public ParenToken(String paren) {
        this.paren = paren;
    }

    @Override
    public String toString() {
        return "PAREN( '" + paren + "' )";
    }

    @Override
    public TokenType getType() {
        return TokenType.PAREN;
    }
}
