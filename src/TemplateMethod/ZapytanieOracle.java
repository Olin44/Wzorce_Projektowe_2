package TemplateMethod;

public class ZapytanieOracle extends SzablonZapytania {
    @Override
    protected String formatujConnect(String nazwaDB) {
        return "Nawiązano połączenie z bazą" + nazwaDB;
    }

    @Override
    protected String formatujSelect(String specZapyt) {
        return specZapyt + ";";
    }
}
