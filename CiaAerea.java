package aviiao;

public class CiaAerea {
    private String codigo;
    private String nome;

    public CiaAerea(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }   

    //  @Override
    public String PrintCiasAereas() {
        return "\nCia Aéria {" +
        "codigo=" + codigo +
        ", nome='" + nome + '\'' +
        '}'+"\n-------------------------------------------------------------\n\n\n";
        //  return String.format("(%d) \t %s",codigo,nome);
    }
}
