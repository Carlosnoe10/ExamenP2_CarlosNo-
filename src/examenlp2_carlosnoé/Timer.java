/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlp2_carlosnoé;

import javax.swing.JLabel;

/**
 *
 * @author cd507
 */
public class Timer extends Thread {

    public JLabel Label;
    public int NumeroSegundos = 0;
    public int NumeroMinutos = 0;
    public String Cadene;

    public Timer(JLabel Label) {
        this.Label = Label;

    }

    public void run() {
        boolean Truers = true;
        while (Truers) {

            Cadene = "";
            if (NumeroMinutos > 9) {
                Cadene += String.valueOf(NumeroMinutos) + ":";
                if (NumeroSegundos > 9) {

                    Cadene += NumeroSegundos;
                } else if (NumeroSegundos == 60) {
                    System.out.println("a");
                    NumeroSegundos = 0;
                    NumeroMinutos++;
                    Cadene += NumeroSegundos;
                } else {

                    Cadene += "0" + NumeroSegundos;
                }
            } else {
                Cadene += "0" + String.valueOf(NumeroMinutos) + ":";
                if (NumeroSegundos > 9) {

                    Cadene += NumeroSegundos;
                } else if (NumeroSegundos == 60) {
                    System.out.println("a");
                    NumeroSegundos = 0;
                    NumeroMinutos++;
                    Cadene += NumeroSegundos;
                } else {

                    Cadene += "0" + NumeroSegundos;
                }
            }
            NumeroSegundos++;
            Label.setText(Cadene);
            try {
                Thread.sleep(10);

            } catch (InterruptedException ex) {

            }
        }
    }

}
