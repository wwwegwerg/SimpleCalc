package main.tokenizer;

import java.util.Optional;

public class TokenFactory {

    public static Optional<Token> createToken(String token) {
        if (TokenPatterns.WHITESPACE.matcher(token).matches()) {
            return Optional.empty();
        }

        if (TokenPatterns.NUMBER.matcher(token).matches()) {
            return Optional.of(new NumberToken(Double.parseDouble(token)));
        }

        if (TokenPatterns.FUNCTION.matcher(token).matches()) {
            return Optional.of(new FuncToken(token));
        }

        if (TokenPatterns.OPERATOR.matcher(token).matches()) {
            return Optional.of(new OpToken(token));
        }

        if (TokenPatterns.PARENTHESE.matcher(token).matches()) {
            return Optional.of(new ParenToken(token));
        }

        if (TokenPatterns.COMMA.matcher(token).matches()) {
            return Optional.of(new CommaToken());
        }

        throw new IllegalArgumentException("Unexpected token: " + token);
    }
}
