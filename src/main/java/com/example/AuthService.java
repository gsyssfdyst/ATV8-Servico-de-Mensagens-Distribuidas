package com.example;

import java.util.Map;

public class AuthService {
    private final Map<String, String> users;

    public AuthService(Map<String, String> users) {
        this.users = users;
    }

    public boolean authenticate(String username, String password) {
        if (username == null || password == null) return false;
        return password.equals(users.get(username));
    }
}
