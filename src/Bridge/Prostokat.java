package Bridge;

public class Prostokat extends Figura{

    BibliotekaV1 v1 = new BibliotekaV1();
    BibliotekaV2 v2 = new BibliotekaV2();

    @Override
    public void rysuj() {
        System.out.println("Rysuję prostokąt");
    }

    @Override
    protected void rysujLinie() {
        v1.rysujLinie();
        v2.rysujLinie();
    }

    @Override
    protected void rysujOkrag() {
        v1.rysujOkrag();
        v2.rysujOkrag();
    }
}
