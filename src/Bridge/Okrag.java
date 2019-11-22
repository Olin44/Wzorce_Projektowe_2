package Bridge;

public class Okrag extends Figura {

    @Override
    public void rysuj() {
        System.out.println("Rysuję okrąg");
        rysujOkrag();
    }

    @Override
    protected void rysujOkrag() {
        v1.rysujOkrag();
        v2.rysujOkrag();
    }
}
