import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ImportData importData = new ImportData("src/iq_ranking.txt");

        System.out.println("\n" + "PROGRAM DRUKUJE RANKING PANSTW W KÓRYCH JEST NAJWISZE IQ" + "\n");

        System.out.println("Lista wszystkich place, country, iq : " + "\n");
        for (IqCountry iqCountry : importData.rankingIQ) {
            System.out.println(iqCountry.place + ", " + iqCountry.country + ", " + iqCountry.iq);
        }


        System.out.println("\n" + "Filtrowanie danych dla przedzialu iq od 80 do 90 : " + "\n");
        for (IqCountry iqCountry : importData.rankingIQ) {
            if (iqCountry.iq <= 90 && iqCountry.iq >= 80) {
                System.out.println(iqCountry.place + ", " + iqCountry.country + ", " + iqCountry.iq);
            }
        }
        System.out.println("\n" + "Filtrowanie danych dla przedzialu iq od 50 do 70 : " + "\n");
        for (IqCountry iqCountry : importData.rankingIQ) {
            if (iqCountry.iq <= 50 && iqCountry.iq >= 70) {
                System.out.println(iqCountry.place + ", " + iqCountry.country + ", " + iqCountry.iq);
            }
        }
        System.out.println("\n" + "Filtrowanie danych dla przedzialu iq od 10 do 20 : " + "\n");
        for (IqCountry iqCountry : importData.rankingIQ) {
            if (iqCountry.iq <= 10 && iqCountry.iq >= 20) {
                System.out.println(iqCountry.place + ", " + iqCountry.country + ", " + iqCountry.iq);
            }
        }
        System.out.println("\n" + "Filtrowanie danych dla przedzialu iq od 30 do 40 : " + "\n");
        for (IqCountry iqCountry : importData.rankingIQ) {
            if (iqCountry.iq <= 30 && iqCountry.iq >= 40) {
                System.out.println(iqCountry.place + ", " + iqCountry.country + ", " + iqCountry.iq);
            }
        }
    }
}