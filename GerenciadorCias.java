package aviiao;

import java.util.ArrayList;

public class GerenciadorCias {
    private ArrayList<CiaAerea> empresas;
    private CiaAerea umCias;
    private int count=0;

    private  GerenciadorCias instance;
    
    public  GerenciadorCias getInstance(){
        if (instance == null)
            instance = new GerenciadorCias(umCias);

        return instance;}

    public GerenciadorCias(CiaAerea umaCias) {
        this.umCias=umaCias;
        this.empresas = new ArrayList<>();
        this.empresas.add(umaCias);
        count++;
    }

    public void inserir(CiaAerea umaCias){
        empresas.add(umaCias);
       }

       public void remove(CiaAerea umaCias){
        empresas.remove(umaCias);
       }

       public void size(ArrayList<CiaAerea> empresas){
        empresas.size(empresa);
       }


    public CiaAerea pesquisarCodigo(String cod){

        for(CiaAerea umCias:empresas){
            if(umCias.getCodigo()==cod) System.out.println(umCias.PrintCiasAereas());
            return umCias;
        }
        return null ;
    }

    public String PesquisarCodigo(String cod){
        for(CiaAerea umCias:empresas){
            if(umCias.getCodigo()==cod) System.out.println(umCias.PrintCiasAereas());

        }
        String aux ="aqui contem um Aerias"+ umCias.PrintCiasAereas();
        return aux;
    }

    public CiaAerea pesquisarNome(String cod){
        cod="Azul Linhas Aérias";
        for(CiaAerea umCias:empresas){
            if(umCias.getCodigo()==cod) System.out.println(umCias.PrintCiasAereas());
            return umCias;
        }
        return null ;
    }

    public String ppesquisarNome(String cod){

        for(CiaAerea umCias:empresas){
            if(umCias.getCodigo()==cod) System.out.println(umCias.PrintCiasAereas());

        }
        String aux = umCias.PrintCiasAereas();
        return aux;
    }

    public  String PrintGerenciadordeCias(){
        String Aux="";
        for(int i = 0; i<empresas.size();i++){
            Aux  = Aux + empresas.get(i).PrintCiasAereas();

        }
        return Aux;

    }
}
