package toc;

import java.util.StringTokenizer;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Oper2 {
    public static void main(String[] args) {
        String normalQuest = "Liczba1 op Liczba2", errorQuest = "Wadliwe dane, popraw. \n" + normalQuest, quest = normalQuest, expor = "";
        while ((expor = showInputDialog(quest, expor)) != null) {
            int res;
            try {
                StringTokenizer st = new StringTokenizer(expor);
                int num1 = Integer.parseInt(st.nextToken());
                String sop = st.nextToken();
                int num2 = Integer.parseInt(st.nextToken());

                if (sop.length() != 1 || st.hasMoreTokens()) throw new IllegalArgumentException();

                switch (sop.charAt(0)) {
                    case '+': res = num1 + num2; break;
                    case '-': res = num1 - num2; break;
                    case '*': res = num1 * num2; break;
                    case '/': res = num1 / num2; break;
                    default: throw new IllegalArgumentException();
                }
            } catch (Exception ex){
                quest = errorQuest;
                continue;
            }
            showMessageDialog(null, "Wynik = " + res);
            quest = normalQuest;
            expor = "";
        }

    }
}
