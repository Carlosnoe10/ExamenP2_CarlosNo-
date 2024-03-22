package examenlp2_carlosnoé;

import java.io.File;
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
    
    

    
    
    

}
