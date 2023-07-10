import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String message;
            do {
                message = reader.readLine();
                writer.println(message);
            } while (!message.equals("sair"));

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
