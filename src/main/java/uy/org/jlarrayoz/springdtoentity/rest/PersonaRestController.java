package uy.org.jlarrayoz.springdtoentity.rest;


import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uy.org.jlarrayoz.springdtoentity.annotation.DTO;
import uy.org.jlarrayoz.springdtoentity.dto.PersonaDTO;
import uy.org.jlarrayoz.springdtoentity.entity.Persona;
import uy.org.jlarrayoz.springdtoentity.repository.PersonaRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/persona")
public class PersonaRestController {

    private static final ModelMapper modelMapper = new ModelMapper();

    private PersonaRepository personaRepository;

    public PersonaRestController(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @GetMapping
    public List<PersonaDTO> getPersonas(){
        return personaRepository.findAll().stream().map(p -> modelMapper.map(p, PersonaDTO.class)).collect(Collectors.toList());
    }

    public void addPersona(@DTO(PersonaDTO.class) Persona persona) {
        personaRepository.save(persona);
    }
}
