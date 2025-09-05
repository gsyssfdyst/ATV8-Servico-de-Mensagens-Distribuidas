package com.example;

import java.util.Map;

/**
 * Serviço de autenticação simples baseado em um mapa usuário->senha.
 */
public class AuthService {
    private final Map<String, String> users;

    public AuthService(Map<String, String> users) {
        this.users = users;
    }

    /**
     * Verifica se as credenciais informadas são válidas.
     *
     * @param username nome do usuário
     * @param password senha do usuário
     * @return true se as credenciais estiverem corretas, false caso contrário
     */
    public boolean authenticate(String username, String password) {
        if (username == null || password == null) return false;
        String stored = users.get(username);
        return stored != null && stored.equals(password);
    }
}
