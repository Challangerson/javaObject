import java.io.*;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
//        File file = new File("e.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        readerFromKeyboard();
        copyFileTXT();


    }

    public static void readFileClass() {
        String filePath = "Example.class";
        try (FileInputStream fis = new FileInputStream(filePath)) {
            byte[] buffer = new byte[20];
            int bytesRead = fis.read(buffer);
            if (bytesRead != -1) {
                System.out.println("Pierwsze 20 bajtów pliku w HEX:");
                for (int i = 0; i < bytesRead; i++) {
                    System.out.printf("%02X ", buffer[i]);
                }
            } else {
                System.out.println("Plik jest pusty.");
            }
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas odczytu pliku: " + e.getMessage());
        }
    }

    public static void readerFromKeyboard() {
        Scanner scanner = new Scanner(System.in);


        while(true) {
            System.out.println("Podaj plik z roszerzeniem .txt: ");
            String text = scanner.nextLine();
            if(text.equals("exit")) {
                break;
            }

            try {
                FileReader fileReader = new FileReader(text);
                readFileTXT(fileReader);

                System.out.println("Czy chcesz kontynuować wpisz tak.");

                String answer = scanner.nextLine();

                if(!answer.equals("tak")) {
                    break;
                }


            } catch (FileNotFoundException e) {
                System.out.println("Nie znaleziono pliku");
                continue;
            }
        }

        scanner.close();

    }

    public static void readFileTXT(FileReader fileReader) {
        try (BufferedReader reader = new BufferedReader(fileReader)) {
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas odczytu pliku: " + e.getMessage());
        }
    }


    public static void copyFileTXT() {
        String filePath = "Example.txt";
        String copyFilePath = "ExampleCopy.txt";

        long startTime = System.nanoTime();

        try (Reader reader = new FileReader(filePath)) {
            Writer writer = new FileWriter(copyFilePath);
            echo(reader, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.nanoTime();

        System.out.println("Czas kopiowania pliku: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Example_Buffer.txt"))) {
            bufferedEcho(bufferedReader, bufferedWriter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        endTime = System.nanoTime();
        System.out.println("Czas kopiowania z buforowaniem: " + (endTime - startTime) + " ns");
    }

    public static void echo(Reader reader, Writer writer) throws IOException {
        int character;
        while ((character = reader.read()) != -1) {
            writer.write(character);
        }

        writer.flush();
    }

    public static void bufferedEcho(BufferedReader reader, BufferedWriter writer) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }

        writer.flush();
    }
}
