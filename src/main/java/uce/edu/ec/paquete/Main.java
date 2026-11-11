package uce.edu.ec.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication {
    @Inject 
    EventoService eventoService;

    public static void main(String[] args) {
        Quarkus.run(Main.class,args);
    }
    @Override
    public int run(String... args) throws Exception {
        Usuario usuario = new Usuario("David", "Herrera");
        Evento evento = new Evento("Critico");
        eventoService.procesar(usuario, evento);
        return 0;
    }
    
   

}
