package com.example;

/**
 * Orquestra a criação de novas mensagens locais e sua replicação para peers.
 * Responsável por atualizar o estado local (NodeState) e enviar cópias para nós remotos.
 */
public class MessageService {
    // ...existing code...

    /**
     * Cria e publica uma nova mensagem originada pelo usuário informado.
     *
     * @param user usuário que posta a mensagem
     * @param content conteúdo da mensagem
     */
    public void postMessage(String user, String content) {
        // ...existing code...
    }

    // ...existing code...
}