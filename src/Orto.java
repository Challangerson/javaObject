import java.util.HashMap;

public class Orto {
    private HashMap<String, String> library;


    public Orto() {
        this.library = new HashMap<>();

        this.library.put("witam", "hello");
        this.library.put("dom", "house");
        this.library.put("kot", "cat");
        this.library.put("pies", "dog");
        this.library.put("kotek", "kitten");
        this.library.put("piesek", "puppy");
        this.library.put("kotki", "kittens");
        this.library.put("psy", "dogs");
        this.library.put("koty", "cats");
        this.library.put("psyki", "puppies");
        this.library.put("ksiazka", "book");
        this.library.put("ksiazki", "books");
        this.library.put("ksiazek", "books");
        this.library.put("drzwi", "door");
        this.library.put("okno", "window");
        this.library.put("stol", "table");
        this.library.put("krzeslo", "chair");
        this.library.put("lampa", "lamp");
        this.library.put("telewizor", "television");
        this.library.put("telefon", "phone");
        this.library.put("komputer", "computer");
        this.library.put("myszka", "mouse");
        this.library.put("klawiatura", "keyboard");
        this.library.put("monitor", "monitor");
        this.library.put("sluchawki", "headphones");
        this.library.put("kabel", "cable");
        this.library.put("kabelki", "cables");
    }

    public String translate(String word) {
        return this.library.get(word);
    }


}
