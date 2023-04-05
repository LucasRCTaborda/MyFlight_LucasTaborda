package aviiao;

public class Aeroporto {
    private String codigo;
    private String nome;
    private Geo loc;

    public Aeroporto(String codigo, String nome, Geo loc) {
        this.codigo = codigo;
        this.nome = nome;
        this.loc = loc;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Geo getLoc() {
        return loc;
    }

    public double getLatitude(){
        return loc.getLatitude();
    }

    public double getLongitude(){
        return loc.getLongitude();
    }

    /*  public boolean(String AeroPartida){
    if(Aeroporto==aoroPartida)
    }
     */
    public String toString(){
        String aux ="";
        aux = "\n___________________________________"+"\nCódigo do aéroporto = "+ getCodigo() +
        "\nNome do áeroporto = " +getNome() + "\n Latitude :" +getLatitude() +"  , "+ "  Longitude :"+
        getLongitude();
        return aux;
    }
}
