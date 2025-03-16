public class Test {
    private String e;

    public Test(String e) {
        this.e = e;
    }

    public String getE() {
        return this.e;
    }

    public void setE(String e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Test{" +
                "e='" + e + '\'' +
                '}';
    }
}
