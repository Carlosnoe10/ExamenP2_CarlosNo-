package examenlp2_carlosnoé;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class AdminDeAutoMoviles implements Serializable {

    public ArrayList<Carro> ADM_Carros = new ArrayList();
    final static long binary2 = 2L;
    public File Archive = null;

    public AdminDeAutoMoviles(ArrayList<Carro> Carros, String Path) {
        Archive = new File(Path);
        ADM_Carros = Carros;
    }

    public ArrayList<Carro> getADM_Carros() {
        return ADM_Carros;
    }

    public void setADM_Carros(ArrayList<Carro> ADM_Carros) {
        this.ADM_Carros = ADM_Carros;
    }

    public File getArchive() {
        return Archive;
    }

    public void setArchive(File Archive) {
        this.Archive = Archive;
    }

    public void cargarArchivo() {
        try {
            ArrayList<Carro> temp = new ArrayList();
            if (Archive.exists()) {
                FileInputStream entrada
                        = new FileInputStream(Archive);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (ArrayList) objeto.readObject()) != null) {
                        ADM_Carros = temp;
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(Archive);
            bw = new ObjectOutputStream(fw);
            ArrayList<Carro> t = ADM_Carros;
            bw.writeObject(t);
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
