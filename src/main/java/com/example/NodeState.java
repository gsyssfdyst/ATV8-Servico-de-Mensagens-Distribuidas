package com.example;

import java.util.List;

/**
 * Modela o estado de um nó no sistema: armazena mensagens locais, o relógio
 * de Lamport e o estado de falha (se o nó está simuladamente inativo).
 */
public class NodeState {
    // ...existing code...

    /**
     * Retorna a lista de mensagens armazenadas no nó.
     *
     * @return lista de mensagens locais
     */
    public List<Message> getMessages() {
        // ...existing code...
    }

    /**
     * Retorna o valor atual do relógio de Lamport do nó.
     *
     * @return valor do relógio de Lamport
     */
    public int getLamportClock() {
        // ...existing code...
    }

    // ...existing code...
}