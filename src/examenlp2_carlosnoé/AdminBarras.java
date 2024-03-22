package examenlp2_carlosnoé;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class AdminBarras extends Thread {

    public JProgressBar Barrita1;
    public Carro Jugador;
    public JProgressBar Barrita2;
    public Carro Jugador2;
    public JLabel One;

    public AdminBarras(JProgressBar Barrita1, Carro Jugador, JProgressBar Barrita2, Carro Jugador2, JLabel One) {
        this.Barrita1 = Barrita1;
        this.Jugador = Jugador;
        this.Barrita2 = Barrita2;
        this.Jugador2 = Jugador2;
        Barrita1.setMaximum(1000);
        Barrita2.setMaximum(1000);
    }

    public Carro getJugador() {
        return Jugador;
    }

    public void setJugador(Carro Jugador) {
        this.Jugador = Jugador;
    }

    public void run() {
        boolean Truers = true;

        while (Truers) {
            Barrita1.setValue(Barrita1.getValue() + Jugador.getVelocidad());

            Barrita2.setValue(Barrita2.getValue() + Jugador2.getVelocidad());

            if (Barrita1.getValue() == 1000) {
                JOptionPane.showMessageDialog(null, "Carro Ganador es " + Jugador.toString() + "Con un tiempo de " + One.getText());
                break;
            } else if (Barrita2.getValue() == 1000) {
                JOptionPane.showMessageDialog(null, "Carro Ganador es " + Jugador2.toString() + "Con un tiempo de " + One.getText());
                break;
            } else {
                
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

}
