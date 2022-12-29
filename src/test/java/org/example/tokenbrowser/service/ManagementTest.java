package org.example.tokenbrowser.service;

import org.example.tokenbrowser.entity.Result;
import org.example.tokenbrowser.entity.TokenUser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementTest {

    Management management;

    @BeforeEach
    void setUp() {
        management = Management.getInstance();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void changePassword() {
        Result<TokenUser> result = management.changePassword("0001", "000", "123", "123");
        System.out.println(result.getMsg());
        System.out.println(result.getData());
    }
}