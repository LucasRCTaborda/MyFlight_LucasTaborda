package aviiao;
import java.util.ArrayList;
public class GerenciadorAeronaves {
    private Aeronave aeronave;
    private ArrayList<Aeronave>VetorNave;
    private String CodigoNave;
    private int count=0;
    private Aeronave[][] vetorDeAeronaves;

    public GerenciadorAeronaves(Aeronave umaNave){
        this.aeronave=umaNave;
        this.VetorNave= new ArrayList<>();

    }

    public void inserir(Aeronave umaNave){
     VetorNave.add(umaNave);
       
    }

    public void deletar(Aeronave aeronave){
        VetorVoo.remove(aeronave);
    }

     public int size(ArrayList<Aeronave> VetorNave){
            return VetorNaveo.size();
        }

    public Aeronave pesquisar(String cod) {
        Aeronave encontrada = new Aeronave();
            for (Aeronave aeronave: VetorNave) {
                if (aeronave.getCodigo().equals(cod)==true){
                    encontrada=aeronave;
                }
        }
        return encontrada;
         }
    

    public String printAeronave(){
        String aux="";
        for(int i = 0;i<VetorNave.size(); i++){
            aux = aux + VetorNave.get(i).toString() + "\n";
        }
        return aux;
    }
}
