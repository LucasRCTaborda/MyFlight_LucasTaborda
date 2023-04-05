package aviiao;
import java.util.ArrayList;
public class GerenciadorVoos {
private ArrayList<Voo>VetorVoo;

public GerenciadorVoos(){
this.VetorVoo = new ArrayList<>();
}

public void inserir(Voo umVoo){
    VetorVoo.add(umVoo);
}
public void deletar(Voo umVoo){
    VetorVoo.remove(umVoo);
}
public int size(ArrayList<Voo> VetorVoo){
    return VetorVoo.size();
}

public String PrintGerenciadorVoo(){
String aux = "";
for(int i=0; i<VetorVoo.size();i++){
aux=aux+ "\n"+ VetorVoo.get(i).toString();
}
return aux;
}

}

