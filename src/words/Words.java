package words;

import java.util.StringTokenizer;

class Words {
    private String[] words;
    private String maxLendWord;
    private String minLendWord;

    public Words(String txt) throws IllegalArgumentException{
    if (txt == null) throw new IllegalArgumentException("Wadliwy argument konstruktora Words: null,");
        StringTokenizer stringTokenizer = new StringTokenizer(txt, " \t\n\r\f.,:;()[]\"'?!-{}");
        int n = stringTokenizer.countTokens();
        if (n == 0) throw new IllegalArgumentException("Wadliwy argument konstruktora Words, napis nie zawiera słów");

        words = new String[n];
        words[0] = stringTokenizer.nextToken();
        int maxL = words[0].length(), minL = maxL;

        int i = 1;

        while (stringTokenizer.hasMoreTokens()){
            String s = stringTokenizer.nextToken();
            int len = s.length();
            if (len>maxL){
                maxL = len;
                maxLendWord = s;
            }
            if (len<minL){
                minL = len;
                minLendWord = s;
            }
            words[i++] = s;
        }
    }

    public int getWordsCount(){
        return words.length;
    }

    public String getWord(int i){
        return (i<1 || i>words.length) ? null : words[i-1];
    }

    public String[] getArrayWords(){
        return words;
    }

    public String getMaxLendWord(){
        return maxLendWord;
    }

    public String getMinLendWord(){
        return minLendWord;
    }
}
