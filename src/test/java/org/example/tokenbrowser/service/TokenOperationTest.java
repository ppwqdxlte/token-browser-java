package org.example.tokenbrowser.service;

import org.example.tokenbrowser.entity.BaseToken;
import org.example.tokenbrowser.entity.Result;
import org.example.tokenbrowser.enumeration.TokenType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TokenOperationTest {

    static TokenOperation tokenOperation;

    @BeforeAll
    static void setUp() {
        tokenOperation = TokenOperation.getINSTANCE();
    }

    @Test
    void queryAll() {
        Result<List<BaseToken>> result = tokenOperation.queryAll();
        System.out.println(result.getMsg());
        System.out.println(result.getData());
        for (BaseToken datum : result.getData()) {
            System.out.println(datum.toString());
        }
    }

    @Test
    void queryAllTCC() {
        Result<List<BaseToken>> result = tokenOperation.queryAllTCC();
        System.out.println(result.getMsg());
        for (BaseToken datum : result.getData()) {
            System.out.println(datum.toString());
        }
    }

    @Test
    void queryAllKCT() {
        Result<List<BaseToken>> result = tokenOperation.queryAllKCT();
        System.out.println(result.getMsg());
        for (BaseToken datum : result.getData()) {
            System.out.println(datum.toString());
        }
    }

    @Test
    void queryTokenListbyMeterStr() {
        TokenType tokenType = TokenType.TCC;
        String meterStr = "0150000844780-0150000844806";
        Result<List<BaseToken>> result = tokenOperation.queryTokenListbyMeterStr(tokenType, meterStr);
        System.out.println(result.getMsg());
        for (BaseToken datum : result.getData()) {
            System.out.println(datum.toString());
        }
    }
}