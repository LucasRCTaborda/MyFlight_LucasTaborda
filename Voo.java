package aviiao;

import java.time.Duration;
import java.time.LocalDateTime;

public class Voo {
    public enum StatusVoo { CONFIRMADO, ATRASADO, CANCELADO };

    private LocalDateTime datahora;
    private Duration duracao;
    private Rota rota;
    private StatusVoo status;

    public Voo(Rota umrota, LocalDateTime umdatahora, Duration umduracao ) {
        this.rota = umrota;
        this.datahora = umdatahora;
        this.duracao = umduracao;
        this.status = StatusVoo.CONFIRMADO; // default é confirmado
    }

    public Rota getRota() {
        return rota;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public StatusVoo getStatus() {
        return status;
    }

    public void setStatus(StatusVoo novo) {
        this.status = novo;
    }

    public String toString() {
         return "Voo [localDateTime=" + getDatahora()+ 
        ", duration=" + getDuracao() + ", status=" + getStatus() + "]";
    }
}
