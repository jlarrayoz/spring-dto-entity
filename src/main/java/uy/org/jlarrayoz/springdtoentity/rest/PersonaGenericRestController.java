package uy.org.jlarrayoz.springdtoentity.rest;

import com.uy.jlarrayoz.genericrestapi.rest.BaseGenericRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uy.org.jlarrayoz.springdtoentity.entity.Persona;
import uy.org.jlarrayoz.springdtoentity.repository.PersonaRepository;

@RestController
@RequestMapping(value = "/personageneric")
public class PersonaGenericRestController extends BaseGenericRestController<Persona> {

    public PersonaGenericRestController(PersonaRepository repository) {
        super(repository);
    }
}
