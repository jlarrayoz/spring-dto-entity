package uy.org.jlarrayoz.springdtoentity.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uy.org.jlarrayoz.springdtoentity.entity.Persona;
import uy.org.jlarrayoz.springdtoentity.repository.PersonaRepository;

@Configuration
public class InitializeDatabase {

    @Bean
    CommandLineRunner dataLoader(PersonaRepository repo) {
        return (args -> {

            repo.save(new Persona(null, "1234567-9", "Juan Angel", "Larrayoz da Rosa"));
            repo.save(new Persona(null, "8765432-1", "Roberto", "Perez"));
        });
    }
}
