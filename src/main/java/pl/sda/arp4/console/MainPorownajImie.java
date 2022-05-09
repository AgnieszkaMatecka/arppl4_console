package pl.sda.arp4.console;

import java.util.Scanner;

public class MainPorownajImie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie:");
        String imie = scanner.next();
        if (imie.equals("Marian")) {
            System.out.println("Siema kolego, dawno sie nie widzielismy!");
        } else {
            System.out.println("Witaj " + imie + "!");
        }
    }
    }
