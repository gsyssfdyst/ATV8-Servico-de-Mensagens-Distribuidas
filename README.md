# Serviço de Mensagens Distribuídas com Consistência Eventual

## Visão Geral

Este projeto é uma implementação de um serviço de mural de mensagens distribuído, desenvolvido para a disciplina de Sistemas Distribuídos. O sistema utiliza múltiplos nós que se comunicam para manter uma cópia replicada de um mural de mensagens compartilhado. A arquitetura foi projetada para garantir consistência eventual e tolerância a falhas, permitindo que os nós se sincronizem mesmo após períodos offline.

### Funcionalidades

* **Arquitetura Distribuída:** O sistema opera com múltiplos nós (mínimo de 3), onde cada um mantém uma cópia local do mural de mensagens.
* **Replicação Assíncrona:** Mensagens postadas em um nó são replicadas para os demais de forma assíncrona.
* **Consistência Eventual:** Um mecanismo de anti-entropia garante que todos os nós eventualmente cheguem a um estado consistente, trocando mensagens periodicamente.
* **Simulação de Falhas:** É possível simular a falha e a recuperação de um nó para demonstrar a robustez e a capacidade de reconciliação do sistema.
* **Comunicação via Sockets TCP:** A comunicação entre os nós é implementada utilizando Sockets TCP para a troca de mensagens.

## Pré-requisitos

* Java Development Kit (JDK) 21 ou superior.
* Apache Maven 3.8 ou superior.

## Como Compilar o Projeto

Para compilar o projeto e gerar o arquivo executável, navegue até a pasta raiz do projeto (onde o arquivo `pom.xml` está localizado) e execute o seguinte comando:

```bash
mvn clean package
