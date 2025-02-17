public class Kamarad {

    private String jmeno;
    private int rokNarozeni;

    Kamarad(String jmeno, int rokNarozeni) {
        this.jmeno = jmeno;
        this.rokNarozeni = rokNarozeni;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setRokNarozeni(int rokNarozeni) {
        this.rokNarozeni = rokNarozeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getRokNarozeni() {
        return rokNarozeni;
    }
}
