package uce.edu.ec.paquete.extensions;

import uce.edu.ec.paquete.Evento;
import uce.edu.ec.paquete.Usuario;

public interface AuditoriaExtension {
    void auditar(Usuario usuario, Evento evento);
}
