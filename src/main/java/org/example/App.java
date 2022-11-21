package org.example;

import java.util.*;
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите что - нибудь: \nИли \"exit\", для выхода.");
            String receivedData = scanner.nextLine();
            if (receivedData.equalsIgnoreCase("exit")) {
                break;
            }
            StringBuilder dataReverser = new StringBuilder();
            dataReverser.append(receivedData);
            dataReverser.reverse();
            System.out.println(dataReverser);
        }
    }
}
