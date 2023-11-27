package Yee;

import java.io.*;
import java.net.Socket;

public class clientHandler extends Thread {
    private Socket clientSocket;
    private account account;

    public clientHandler(Socket socket, account account) {
        this.clientSocket = socket;
        this.account = account;
    }

    public void run() {
        try {
            ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
            double amount = (double) in.readObject();
            account.deposit(amount);

            in.close();
            clientSocket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
