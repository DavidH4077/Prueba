package uce.edu.ec.paquete.interceptors;

import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import uce.edu.ec.paquete.Evento;
import uce.edu.ec.paquete.Usuario;
import uce.edu.ec.paquete.extensions.AuditoriaExtensionMail;

@Auditoria 
@Interceptor 
@Priority (3)
public class AuditoriaInterceptorMail {
    @Inject 
    AuditoriaExtensionMail auditoriaExtensionMail;

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception {
        Object resultado=context.proceed();

        Object[] parameters = context.getParameters();
        Usuario usuario = (Usuario) parameters[0];
        Evento evento = (Evento) parameters[1];
        auditoriaExtensionMail.auditar(usuario, evento);
        return resultado;
    }
}
