package Bridge;

public class BibliotekaV1 implements Biblioteka{

    @Override
    public void rysujLinie() {
        BG1.narysuj_linie();
    }

    @Override
    public void rysujOkrag() {
        BG1.narysuj_okrag();
    }
}
