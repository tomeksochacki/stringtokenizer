package toc;

import java.io.*;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

class MainToc {
    public static void main(String[] args) throws Exception {
        Scanner fnameScan = new Scanner(showInputDialog("in out ?"));
        File in = new File(fnameScan.next());
        BufferedWriter out = new BufferedWriter(new FileWriter(fnameScan.next()));
        Scanner inScan = new Scanner(in);
        StringBuffer sb = new StringBuffer();
        try {
            while (inScan.hasNextLine())
                sb.append(inScan.nextLine());
            inScan.close();
            Toc toc = new Toc(sb.toString());
            out.write(toc.getToc());
        }
        finally {out.close();
        }
    }
}
