import java.util.StringTokenizer;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Oper {
    public static void main(String[] args) {
        String normalQues = "Liczba op Liczba2", errorQuest = "Wadliwe dane, popraw.\n", quest = normalQues;
        String expr = "";

        while ((expr = showInputDialog(quest, expr)) != null){
            StringTokenizer st = new StringTokenizer(expr);
            if (st.countTokens() != 3) {
                quest = errorQuest;
                continue;
            }

        String sum1 = st.nextToken(), sop = st.nextToken(), sum2 = st.nextToken();
            int num1 = 0, num2 = 0, res = 0; //liczby do obliczeń i wynik;
            try {
                num1 = Integer.parseInt(sum1);
                num2 = Integer.parseInt(sum2);
            }catch (NumberFormatException ex){
                quest = errorQuest;
                continue;
            }
            char op = sop.charAt(0);
            if (sop.length() != 1 || (op == '/' && num2 == 0)){
            quest = errorQuest;
            continue;
            }
            switch (op){
                case '+': res = num1 + num2; break;
                case '-': res = num1 - num2; break;
                case '*': res = num1 * num2; break;
                case '/': res = num1 / num2; break;
                default:{
                    quest = errorQuest;
                    continue;
                }
            }
            showMessageDialog(null, "Wynik =" + res);
            quest = normalQues;
            expr = "";
            }

    }
}
