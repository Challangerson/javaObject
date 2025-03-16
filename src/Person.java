public class Person {
    private String imie, nazwisko;
    private int wiek;
    private float waga, wzrost;

    public Person(String imie, String nazwisko, int wiek, float waga, float wzrost) {

        if(imie == null || nazwisko == null) {
            throw new NullPointerException("Niepoprawne dane");
        }

        if(wiek < 0 || waga < 0 || wzrost < 0) {
            throw new NegativeNumberException();
        }
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.waga = waga;
        this.wzrost = wzrost;
    }

    public String getImie() {
        return this.imie;
    }

    public void setImie(String imie) {
        if(imie == null) {
            throw new NullPointerException("Niepoprawne dane");
        }
        this.imie = imie;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko == null) {
            throw new NullPointerException("Niepoprawne dane");
        }
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return this.wiek;
    }

    public void setWiek(int wiek) {
        if (wiek < 0) {
            throw new NegativeNumberException();
        }
        this.wiek = wiek;
    }

    public float getWaga() {
        return this.waga;
    }

    public void setWaga(float waga) {
        if (waga < 0) {
            throw new NegativeNumberException();
        }
        this.waga = waga;
    }

    public float getWzrost() {
        return this.wzrost;
    }

    public void setWzrost(float wzrost) {
        if (wzrost < 0) {
            throw new NegativeNumberException();
        }
        this.wzrost = wzrost;
    }
}
