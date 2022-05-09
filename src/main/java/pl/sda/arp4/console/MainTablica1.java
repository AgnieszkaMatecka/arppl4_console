package pl.sda.arp4.console;

import java.util.Random;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class MainTablica1 {
    public static void main(String[] args) {
        int[] tablica = new int[10];

        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(21)-10;

            tablica[i] = wylosowanaLiczba;
        }

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);

        }


    }
}
