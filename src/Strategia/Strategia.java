package Strategia;

public class Strategia {

    public static void main(String[] args) {
        //Obliczanie ceny brutto dla towarów jako cena + podatek
        double[] ceny_towarow = {1.2, 2.3, 3.4, 5.6, 7.8, 7.9};
        Konfiguracja konfiguracja = new Konfiguracja("Polska");
        Zamowienie zamowieniePolska = new Zamowienie(ceny_towarow, konfiguracja);
        Konfiguracja konfiguracjaNiemcy = new Konfiguracja("Niemcy");
        Zamowienie zamowienieNiemcy = new Zamowienie(ceny_towarow, konfiguracjaNiemcy);

        System.out.println("Kwota podatku w Polsce: " + zamowieniePolska.obliczPodatek());
        System.out.println("Kwota podatku w Niemczech: " + zamowienieNiemcy.obliczPodatek());
    }
}
