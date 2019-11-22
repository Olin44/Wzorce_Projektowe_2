package Strategia;
public class Konfiguracja {
    String nazwaKraju;
    public Konfiguracja(String nazwaKraju) {
        this.nazwaKraju = nazwaKraju;
    }

    public ObliczPodatek getKrajPodatek() {
        if (nazwaKraju.equals("Polska")) {
            return new PodatekPolska();
        }
        if (nazwaKraju.equals("Niemcy")) {
            return new PodatekNiemcy();
        }
        else{
            return new PodatekPolska();
        }
    }
}
