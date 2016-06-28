// Copyright (c) 2016 Amanda Murphy & Randy Perrone
// This code is available under the "MIT License".
// Please see the file COPYING in this distribution
// for license terms.

package com.example.amanda.trails;

import android.os.MessageQueue;

/**
 * Created by Amanda on 7/10/2016.
 */
public class User {
    String name;
    String username;
    String password;

    User(String name, String uName, String Password)
    {
        this.name = name;
        this.username = uName;
        this.password = Password;
    }

    User(String uName, String pass)
    {
        username = uName;
        password = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
