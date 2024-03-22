package examenlp2_carlosnoé;

import javax.swing.JProgressBar;

public class AdminBarra extends Thread{
    public JProgressBar Barrita;
    public Carro Jugador;    

    public AdminBarra(JProgressBar Barrita, Carro Jugador) {
        this.Barrita = Barrita;
        this.Jugador = Jugador;
    }

    public JProgressBar getBarrita() {
        return Barrita;
    }

    public void setBarrita(JProgressBar Barrita) {
        this.Barrita = Barrita;
    }

    public Carro getJugador() {
        return Jugador;
    }

    public void setJugador(Carro Jugador) {
        this.Jugador = Jugador;
    }
    
    
    
}
