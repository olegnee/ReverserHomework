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
            System.out.println(dataReverser(receivedData));
        }
    }
    public static StringBuilder dataReverser(String receivedWord) {
        StringBuilder wordReverser = new StringBuilder();
        wordReverser.append(receivedWord);
        return wordReverser.reverse();
    }
}
