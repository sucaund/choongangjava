package Yee;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class bankClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        out.writeObject(amount);

        out.close();
        socket.close();
    }
}
