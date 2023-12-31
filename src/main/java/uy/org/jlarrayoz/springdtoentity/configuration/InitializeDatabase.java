package uy.org.jlarrayoz.springdtoentity.configuration;

import com.uy.jlarrayoz.genericrestapi.repository.BaseGenericRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uy.org.jlarrayoz.springdtoentity.entity.Persona;
import uy.org.jlarrayoz.springdtoentity.entity.TipoDocumento;
import uy.org.jlarrayoz.springdtoentity.repository.PersonaRepository;

@Configuration
public class InitializeDatabase {

    @Bean
    CommandLineRunner dataLoader(PersonaRepository repoPersona, BaseGenericRepository<TipoDocumento, Long> repoTipoDocumento) {
        return (args -> {
            TipoDocumento ci = new TipoDocumento("Cedula de Identidad");
            ci = repoTipoDocumento.save(ci);
            repoTipoDocumento.save(new TipoDocumento("Pasaporte"));
            repoPersona.save(new Persona("1234567-9", "Juan Angel", "Larrayoz da Rosa", ci));
            repoPersona.save(new Persona("8765432-1", "Roberto", "Perez", ci));
        });
    }
}
