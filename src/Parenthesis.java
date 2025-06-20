public class Parenthesis extends Token<Character> {
    private final boolean isOpeningParenthesis;

    Parenthesis(char symbol, int priority) {
        super(symbol, priority);
        this.isOpeningParenthesis = symbol == '(';
    }

    public boolean isOpeningParenthesis() {
        return isOpeningParenthesis;
    }
}
