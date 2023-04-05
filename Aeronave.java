package aviiao;

public class Aeronave {
    private String codigo;
    private String descricao;
    private int capacidade;

    public Aeronave(String codigo, String descricao,int umaCapacidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.capacidade=umaCapacidade;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCapacidade(){
        return capacidade;
    }

    @Override
    public String toString() {
        return "\nAeronave{" +
        "codigo = " + codigo +
        ", nome ='" + getDescricao() + 
        "Código= " +getCodigo()+
        "\n-------------------------------------------------------------";

    
    }}
