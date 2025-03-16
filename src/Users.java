import java.util.Scanner;

public class Users {

    static String[] users = {"user1", "user2", "user3", "user4", "user5", "user6", "user7", "user8", "user9", "user10"};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {
            System.out.println("Podaj liczbe: ");
            String word = scanner.nextLine();

            try {
                int number = Integer.parseInt(word);

                if(number == -1) {
                    System.out.println("Koniec programu");
                    break;
                }

                if(number < 1 || number > 10) {
                    System.out.println("Podana liczba musi byc z zakresu 1-10");
                    continue;
                }

                System.out.println("User: " + users[number - 1]);
                return;
            } catch (NumberFormatException e) {
                System.out.println("Podana wartosc nie jest liczba");
                break;
            }
        }

        scanner.close();





    }
}
