package aviiao;
import java.util.ArrayList;
public class GerenciadorAeroportos {

    private Aeroporto nAeroporto;
    private ArrayList<Aeroporto>VetorAeroporto;
    

    public GerenciadorAeroportos(Aeroporto umAeroporto){
        this.nAeroporto=umAeroporto;
        this.VetorAeroporto = new ArrayList<>();
    
    }

    public void inserir(Aeroporto umAeroporto){
       VetorAeroporto.add(umAeroporto);

    }

    public void remove(Aeroporto umAeroporto){
        VetorAeroporto.remove(umAeroporto);
 
     }

     public int size(ArrayList<Aeroporto> VetorAeroporto){
        return VetorAeroporto.size();
    }

    public Aeronave pesquisar(String cod) {
        for (Aeroporto nAeroporto: VetorAeroporto) {
            if (nAeroporto.getCodigo() == cod)
                return nAeroporto;
        }
        return null;
    }

    public String PrintAeroporto(){
        String aux= " ";
        for(int i=0; i<VetorAeroporto.size();i++){
            aux = aux + VetorAeroporto.get(i).toString()+"\n";}
        return aux;}

}

