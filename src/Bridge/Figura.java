package Bridge;

public abstract class Figura {
    final BibliotekaV1 v1;
    final BibliotekaV2 v2;

    public Figura() {
        this.v1 = new BibliotekaV1();
        this.v2 = new BibliotekaV2();
    }

    public abstract void rysuj();

    protected void rysujLinie() {

    }

    protected void rysujOkrag() {

    }
}
