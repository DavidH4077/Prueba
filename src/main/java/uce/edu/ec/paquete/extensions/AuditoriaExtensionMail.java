package uce.edu.ec.paquete.extensions;

import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.ec.paquete.Evento;
import uce.edu.ec.paquete.Usuario;

@ApplicationScoped 
public class AuditoriaExtensionMail implements AuditoriaExtension {

    @Override
    public void auditar(Usuario usuario, Evento evento) {
        System.out.println("Auditando evento: " + evento.getTipoEvento() + " jh mail " + usuario.getNombre() + " " + usuario.getApellido());
    }

}
