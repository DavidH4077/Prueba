package uce.edu.ec.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.ec.paquete.interceptors.Auditoria;

@ApplicationScoped
public class EventoService {

    @Auditoria
    public void procesar(Usuario usuario, Evento evento) {
        System.out.println("Procesando evento: " + evento.getTipoEvento() + " para el usuario: " + usuario.getNombre()
                + " " + usuario.getApellido());
    }

}
