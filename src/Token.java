abstract class Token<T> {
    private final T symbol;
    private final int priority;

    Token(T symbol, int priority) {
        this.symbol = symbol;
        this.priority = priority;
    }

    public T getSymbol() {
        return symbol;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return symbol.toString();
    }
}
