package com.ivanmarreta.simboradevs.solid.singleresponsibility;

public class UserSettingsService {

    public void changeEmail(User user){
        if (SecurityService.checkAccess(user)){
            //Grant option to change
        }
    }
}
