package toc;

class Toc {

    private String doc; //Przekazany dokument
    private String toc = ""; //Wnikowy spis treści

    //Separator końca wiersza; ponieważ jest zależny pd systemu
    //pobieramy go jako wartość tzw. właściwości systemowej

    private final String ls = System.getProperty("line.separator");

    public Toc(String doc){ //Konstruktor
        this.doc = doc;
    }

    public String getToc() throws IllegalStateException{
        int p = 0; //pozycja od której zaczynamy szukanie "<h2>"
        while ((p = doc.indexOf("<h2>", p)) != -1) { //dopuki są "<h2>"
            //poszukajmy znacznika zamykajacego
            //end jest indeksem na którym on występuje

            int end = doc.indexOf("</h2>", p + 4);
            if (end == -1) throw new IllegalStateException("Invalid document structure");
            //w przeciwnym razie wyłuskujemy nagłóek
            toc += doc.substring(p+4, end) + ls; //ls separator wierszy
            p = end+5;
        }
        return toc;
    }

}
