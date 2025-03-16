public class Car {
    private String marka,nazwa;
    private int rokProdukcji, maxPredkosc;
    private double cena;

    public Car(String marka, String nazwa, int rokProdukcji, int maxPredkosc, double cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.rokProdukcji = rokProdukcji;
        this.maxPredkosc = maxPredkosc;
        this.cena = cena;
    }


    public String getMarka() {
        return this.marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return this.nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getRokProdukcji() {
        return this.rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public int getMaxPredkosc() {
        return this.maxPredkosc;
    }

    public void setMaxPredkosc(int maxPredkosc) {
        this.maxPredkosc = maxPredkosc;
    }

    public double getCena() {
        return this.cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
