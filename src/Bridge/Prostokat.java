package Bridge;

public class Prostokat extends Figura{

    @Override
    public void rysuj() {
        System.out.println("Rysuję prostokąt");
        rysujLinie();
        rysujLinie();
        rysujLinie();
        rysujLinie();
    }

    @Override
    protected void rysujLinie() {
        v1.rysujLinie();
        v2.rysujLinie();
    }

}
