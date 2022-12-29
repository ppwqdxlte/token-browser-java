package org.example.tokenbrowser.service;

public class TokenOperation {

    private TokenOperation() {
    }

    private static final TokenOperation INSTANCE = new TokenOperation();

    public static TokenOperation getINSTANCE() {
        return INSTANCE;
    }


}
