package org.example.tokenbrowser.service;

import org.example.tokenbrowser.entity.Result;
import org.example.tokenbrowser.entity.TokenUser;

public class Management {

    private Management(){}

    private static final Management INSTANCE = new Management();

    public static Management getInstance(){
        return INSTANCE;
    }

    public Result<TokenUser> changePassword(String username,String oldPwd,String newPwd01,String newPwd02){
        return null;
    }
}
