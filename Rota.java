package aviiao;

public class Rota {
    private CiaAerea cia;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;

    public Rota(CiaAerea cia, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
        this.cia = cia;
        this.origem = origem;
        this.destino = destino;
        this.aeronave = aeronave;        
    }    

    public CiaAerea getCia() {
        return cia;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public Aeronave getAeronave() {
        return aeronave;
    } 

    public String PrintRotas(){
        return "Rota********************************************{" +
        "\n\n\n\n\n\nCompanhia Aeria "+ getCia().getNome()+
        "\nAeroporto de Origem = " + getOrigem() +
        ",\nn Aeroporto de Destino ='" +getDestino()+ 
        "\nAeronave de transporte= " + getAeronave();

    }

}

