package uce.edu.ec.paquete.interceptors;

import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import uce.edu.ec.paquete.Evento;
import uce.edu.ec.paquete.Usuario;
import uce.edu.ec.paquete.extensions.AuditoriaExtensionMemorando;

@Auditoria 
@Interceptor 
@Priority (2)
public class AuditoriaInterceptorMemorando {
    @Inject 
    AuditoriaExtensionMemorando auditoriaExtensionMemorando;

    @AroundInvoke 
    public Object interceptar(InvocationContext context) throws Exception{
        Object resultado=context.proceed();

        Object [] parametros=context.getParameters();
        Usuario usuario=(Usuario)parametros[0];
        Evento evento=(Evento)parametros[1];
        auditoriaExtensionMemorando.auditar(usuario, evento);
        return resultado;
    }
}
