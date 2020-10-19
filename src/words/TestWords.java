package words;

import static javax.swing.JOptionPane.showInputDialog;

class TestWords {
    public static void main(String[] args) {
        String txt;
        while ((txt = showInputDialog("Wpisz tekst")) != null){
        Words w = new Words(txt);
        int n = w.getWordsCount();
        System.out.println("Liczba słów: " + n);
        System.out.println("Kolejne słowa: ");
        for (int i = 1; i<=n; i++)
        System.out.println(w.getWord(i));
        int iw = Integer.parseInt(showInputDialog("Podaj numer słowa:"));
        System.out.println("Słowo o numerze: " + iw + " : " + w.getWord(n+1));
        System.out.println("Kolejne słowa: ");
        String[]words = w.getArrayWords();
        for (String wrd: words)
        System.out.println(wrd);
        System.out.println("Najdłuższe słowo: " + w.getMaxLendWord());
        System.out.println("Najkrótsze słowo: " + w.getMinLendWord());
        }
    }
}
