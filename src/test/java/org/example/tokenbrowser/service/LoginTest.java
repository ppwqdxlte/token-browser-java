package org.example.tokenbrowser.service;

import org.example.tokenbrowser.entity.Result;
import org.example.tokenbrowser.entity.TokenUser;
import org.junit.jupiter.api.*;

class LoginTest {

    Login login;

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getInstance() {
        login = Login.getInstance();
    }

    @Test
    void submit() {
        getInstance();
        Result<TokenUser> submit = login.submit("0001", "123");
        Assertions.assertNotNull(submit.getData(),submit.getMsg());
        System.out.println(submit.getData().toString());
    }

}