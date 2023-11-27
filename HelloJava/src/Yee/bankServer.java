package Yee;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class bankServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        account account = new account(0);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            new clientHandler(clientSocket, account).start();
        }
    }
}
