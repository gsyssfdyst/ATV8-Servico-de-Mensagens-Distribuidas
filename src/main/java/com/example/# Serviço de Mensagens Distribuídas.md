# Serviço de Mensagens Distribuídas

Descrição
Este projeto simula um mural de mensagens compartilhado entre vários nós. Há replicação assíncrona e um mecanismo de reconciliação (Anti-Entropy) para alcançar consistência eventual entre nós.

Pré-requisitos
- Java 21
- Maven

Compilação
Para compilar o projeto:
mvn compile

Execução
Use o Maven Exec Plugin para executar um nó. Os argumentos esperados são:
- nodeName (identificador do nó)
- port (porta onde o nó escutará)
- peers (lista de peers no formato host:port separados por vírgula)

Exemplo (três terminais separados):

Terminal 1 (Nó A):
mvn exec:java -Dexec.args="nodeA 8001 localhost:8002,localhost:8003"

Terminal 2 (Nó B):
mvn exec:java -Dexec.args="nodeB 8002 localhost:8001,localhost:8003"

Terminal 3 (Nó C):
mvn exec:java -Dexec.args="nodeC 8003 localhost:8001,localhost:8002"

Observações
- Apenas usuários autenticados podem postar mensagens. Usuários de teste estão definidos no Main (ex: user1/pass1, user2/pass2).
- A leitura das mensagens (show/view) permanece pública.
