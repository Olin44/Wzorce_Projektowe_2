package TemplateMethod;

public abstract class SzablonZapytania {
    public String wykonajZapytanie(String nazwaDB, String specZapyt){
        String komendaDB;
        System.out.println(formatujConnect(nazwaDB));
        komendaDB = formatujSelect(specZapyt);
        return komendaDB;
    }

    protected abstract String formatujConnect(String nazwaDB);
    protected abstract String formatujSelect(String specZapyt);

}
