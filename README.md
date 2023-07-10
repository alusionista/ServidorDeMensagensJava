# Servidor de Mensagens Multiclientes

Este projeto consiste em um servidor de mensagens multithreaded em Java, onde o servidor é capaz de receber várias mensagens de vários clientes ao mesmo tempo. As mensagens enviadas para o servidor são exibidas na saída padrão (console) do servidor.

## Funcionalidades

O servidor possui as seguintes funcionalidades:

- Receber múltiplas conexões de clientes usando threads.
- Exibir as mensagens recebidas de cada cliente na tela do servidor.

O cliente possui as seguintes funcionalidades:

- Conectar-se ao servidor.
- Enviar quantas mensagens quiser.
- Encerrar a conexão e o programa cliente digitando a mensagem "sair".

## Pré-requisitos

- Java Development Kit (JDK) instalado na máquina.

## Como executar o servidor e o cliente

1. Faça o download dos arquivos `Servidor.java` e `Cliente.java`.
2. Abra um terminal e navegue até o diretório onde os arquivos foram salvos.
3. Compile os arquivos Java digitando o seguinte comando no terminal:

   ```shell
   javac Servidor.java Cliente.java
   ```

4. Em uma janela de terminal separada, inicie o servidor executando o seguinte comando:

   ```shell
   java Servidor
   ```

   O servidor será iniciado e ficará aguardando conexões de clientes.

5. Em outra janela de terminal, inicie um ou mais clientes executando o seguinte comando:

   ```shell
   java Cliente
   ```

   O cliente será iniciado e permitirá que você digite mensagens para enviar ao servidor.

6. Digite as mensagens desejadas no cliente e pressione Enter para enviá-las ao servidor. As mensagens serão exibidas na saída padrão do servidor.

7. Para encerrar a conexão e sair do cliente, digite a mensagem "sair" e pressione Enter.

## Observações

- Certifique-se de iniciar o servidor antes de iniciar os clientes, pois os clientes precisam se conectar a um servidor em execução.
- O servidor estará escutando na porta `12345`. Verifique se essa porta está disponível em seu sistema.
- Você pode executar vários clientes em janelas de terminal separadas para testar a capacidade do servidor de receber mensagens simultâneas de vários clientes.

Sinta-se à vontade para explorar e modificar esse projeto de acordo com suas necessidades. Divirta-se!