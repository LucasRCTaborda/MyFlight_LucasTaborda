package aviiao;
import java.util.ArrayList;
public class GerenciadorRotas {
    private Rota rota;
    private ArrayList<Rota> TodasRotas;
    
    public GerenciadorRotas(Rota rota){
        this.rota=rota;
        this.TodasRotas=new ArrayList<>();

    }
        

   public void inserir(Rota rota) {
        TodasRotas.add( rota);
    }
    public void remove(Rota rota) {
        TodasRotas.remove(rota);
    }
    public void size(ArrayList<Rota> TodasRotas) {
        TodasRotas.size( TodasRotas);
    }

    public Rota BuscarPorOrigem(Aeroporto umAeroporto) {
        for (Rota rota : TodasRotas) {
            for(Aeroporto nAeroporto: VetorAeroporto){
            if (rota.getOrigem().equals(umAeroporto)) {
                System.out.println(rota.toString());
                return rota;}
            }
        }
        return null ;    
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


/**
 * @param aeroporto
 * @return
 */
public Rota pesquisar(Aeroporto aeroporto){
    Rota encontrado = new Rota();
    for(Rota r : TodasRotas){
        if(r.getAeroportoOrg().equals(aeroporto)==true){
            encontrado=r; 
        }
}
    return encontrado;
}
   
    
public String PrintGerenciadorRotas() {
        String aux = "";
        for(int i = 0; i < TodasRotas.size(); i++) {
            aux = aux + TodasRotas.get(i).PrintRotas()+ "\n";
        }
        return aux;
    }
} 

