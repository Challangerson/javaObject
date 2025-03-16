import java.util.Scanner;

public class WprowadzZKonsolo {

    public static void print() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");


        String word = sc.nextLine();

        try {
            int number = Integer.parseInt(word);
            System.out.println("Podana liczba to: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Podana wartosc nie jest liczba");
        }

        sc.close();
    }

    public static void bool() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wartosc logiczna: ");

        String word = sc.nextLine();

        try {
            boolean bool = Boolean.parseBoolean(word);
            System.out.println("Podana wartosc logiczna to: " + bool);
        } catch (NumberFormatException e) {
            System.out.println("Podana wartosc nie jest wartoscia logiczna");
        }

        sc.close();
    }

    public static void getDouble() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe zmiennoprzecinkowa: ");

        String word = sc.nextLine();

        try {
            double number = Double.parseDouble(word);
            System.out.println("Podana liczba zmiennoprzecinkowa to: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Podana wartosc nie jest liczba zmiennoprzecinkowa");
        }

        sc.close();
    }
}
