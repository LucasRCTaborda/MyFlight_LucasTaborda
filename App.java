package aviiao;
import java.time.LocalDateTime;
import java.time.Duration;
public class App {public static void main(String[] args) {
        System.out.println("\fMyFlight project...");
        // Iniciando as Copanhias Aérias !!!
        CiaAerea ci1 = new CiaAerea ("JJ","Latam Linhas Aérias");
        CiaAerea ci2 = new CiaAerea ("G3","Gol Linha Aérias SA");
        CiaAerea ci3 = new CiaAerea ("TP","TAP Portugal");
        CiaAerea ci4 = new CiaAerea ("AD","Azul Linhas Aérias");

        GerenciadorCias GERECIA = new GerenciadorCias(ci1);
        GERECIA.inserir(ci2);
        GERECIA.inserir(ci3);
        GERECIA.inserir(ci4);

        System.out.println("Companhias Cadastradas no Systema São:"+GERECIA.PrintGerenciadordeCias());        

        //GERECIA.pesquisarCodigo("JJ");
        // System.out.println("PRA TESTAR DADOS"+ GERECIA.pppesquisarNome());

        // Fim De Companhia Aérias !!!
        // Iniciando Aeronaves !!!

        Aeronave nave1 = new Aeronave("733","Boeing 737-300",140);
        Aeronave nave2 = new Aeronave("73G","Boeing 737-700",126);
        Aeronave nave3 = new Aeronave("380","Airbus Industrie A380",644);
        Aeronave nave4 = new Aeronave("764","Boeing 767-400",304);

        GerenciadorAeronaves  c1 = new GerenciadorAeronaves (nave1);
        c1.inserir(nave2);
        c1.inserir(nave3);
        c1.inserir(nave4);

        // System.out.println("Aéronaves :"+"\n"+nave1.toString()); 
        System.out.println("Aéronaves :"+"\n"+c1.printAeronave()); 

        // Fim De Aeronaves !!!
        //Inicio de Aeroportos!!!

        Geo porto1 = new Geo(-29.9939,-51.1711);
        Geo porto2 = new Geo(-23.4356,-46.4731);
        Geo porto3 = new Geo(38.7742 ,-9.1342);
        Geo porto4 = new Geo(25.7933,-80.2906);
        Geo porto5 = new Geo(-22.8089,-43.2436);

        Aeroporto por1 = new Aeroporto("POA","Salgado intlApt ", porto1);
        Aeroporto por2 = new Aeroporto(" GRU","São Paulo Guarulhos Intl Apt ", porto2);
        Aeroporto por3 = new Aeroporto("LIS","Lisbon ",porto3);
        Aeroporto por4 = new Aeroporto("MIA","Miami Internarional Apt ",porto4);
        Aeroporto por5 = new Aeroporto("GIG","Aeroporto Internacional Tom Jobim ",porto5);

        // System.out.println("AéroPorto :"+"\n"+por1.toString()); 
        GerenciadorAeroportos  Aero = new GerenciadorAeroportos (por1);
        Aero.inserir(por2);
        Aero.inserir(por3);
        Aero.inserir(por4);
        Aero.inserir(por5);

        System.out.println("Aéroporto :"+"\n"+Aero.PrintAeroporto()); 
        //Fim de Aeroportos!!!
        /// Inicio de Rotas !!!
        System.out.println("\n+-+-+-+-+-+-+-\n"+ci1.PrintCiasAereas());

        
      //  System.out.println("Rotas dados Para TEST------------>"+Rota1.BuscarPorOrigem());

        
        /*Rotas Rota2 = new Rotas("G3","POA","GRU",738);
        Rotas Rota3 = new Rotas("TP","MIA","LIS",332);
        Rotas Rota4 = new Rotas("JJ","GRU","GIG",320);*/
        // Fim Rotas !!
        // System.out.println(GERECIA.ppesquisarCodigo(toString));
    
        Rota Rota1 = new Rota(ci4,por1,por2,nave2);
        LocalDateTime dataHora = LocalDateTime.of(2023,04,03,13,44);
        Duration duracao = Duration.ofMinutes(120);
        //voo.setetStatus(ATRASADO);
          //Inicio Voos!!!
          Voo vo1 = new Voo(Rota1,dataHora,duracao);
        System.out.println("Rotas representacoes !! "+Rota1.PrintRotas());
        System.out.println(vo1.toString());
      //  v10.StatusVoo("CANCELADO");
          Voo v10 = new Voo(Rota1, dataHora,duracao );

       System.out.println("Será que vai bombarrrrrr_________>>>>>>>>>>>>>>>>"+v10.toString());
    }}
