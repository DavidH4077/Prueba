package uce.edu.ec.paquete;

public class Evento {
private String tipoEvento;

    public Evento() {
        
    }

    public Evento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
}
