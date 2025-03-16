import java.util.*;

public class Main {
    public static void main(String[] args) {


        TupleFour tupleFour = new TupleFour("3", 1, new Test("e"), 12);
        String[] users = {"user1", "user2", "user3", "user4", "user5", "user6", "user7", "user8", "user9", "user10"};

        System.out.println(tupleFour.toString());


        List<Integer> list = new ArrayList<>();

        Random r = new Random(1000);

        for(int i = 0; i < 100; i++) {
            list.add(r.nextInt());
        }


        list.sort(Integer::compareTo);

        System.out.println(list);

        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i = 0; i < 100; i++) {
            treeSet.add(r.nextInt());
        }

        for(Integer i : treeSet) {
            System.out.println(i);
        }

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Camry", 2018, 180, 10000));
        cars.add(new Car("Honda", "Civic", 2020, 170, 12000));
        cars.add(new Car("Ford", "Focus", 2019, 160, 9000));
        cars.add(new Car("BMW", "3 Series", 2021, 220, 25000));
        cars.add(new Car("Mercedes", "C-Class", 2022, 210, 30000));
        cars.add(new Car("Audi", "A4", 2017, 200, 15000));
        cars.add(new Car("Volkswagen", "Golf", 2018, 180, 11000));
        cars.add(new Car("Hyundai", "Elantra", 2021, 175, 13000));
        cars.add(new Car("Kia", "Optima", 2020, 185, 14000));
        cars.add(new Car("Mazda", "Mazda3", 2019, 190, 12500));
        cars.add(new Car("Nissan", "Altima", 2022, 195, 20000));

        for(Car car : cars) {
            System.out.println(car);
        }


        Scanner sc = new Scanner(System.in);
        Orto orto = new Orto();

        int x = 0;

        while(true) {

            System.out.println("Enter a word to translate: \n");
            String word = sc.nextLine();

            if(word.equals("koniec!")) {
                sc.close();
                break;
            }

            String translated = orto.translate(word);

            if(translated != null) {
                System.out.println("Translated: " + translated);
            } else {
                System.out.println("Word not found in dictionary.");
            }



        }

        //Numer indexu




       // new WprowadzZKonsolo().print() <- inne metody dostepne;

    }
}