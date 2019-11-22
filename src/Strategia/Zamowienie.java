package Strategia;

public class Zamowienie {
    private double[] towary;
    private final ObliczPodatek obliczPodatek;

    public Zamowienie(double[] towary, Konfiguracja konfiguracja) {
        this.towary =  towary;
        this.obliczPodatek = konfiguracja.getKrajPodatek();
    }

    public double obliczPodatek(){
        double suma = 0;
        for(double cena : towary){
            suma += obliczPodatek.kwotaPodatku(2, cena);
        }
        return suma;
    }
}
