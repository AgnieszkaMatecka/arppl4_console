package pl.sda.arp4.console;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imie:");
        String zmiennaImie = scanner.next();
        System.out.println("Witaj " + zmiennaImie + "!");
    }
}
