package uy.org.jlarrayoz.springdtoentity.mapper;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import uy.org.jlarrayoz.springdtoentity.dto.PersonaDTO;
import uy.org.jlarrayoz.springdtoentity.dto.UpdatePersonaDTO;
import uy.org.jlarrayoz.springdtoentity.entity.Persona;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaMapperUT {

    private static final ModelMapper modelMapper = new ModelMapper();

    @Test
    public void testPersonaDtoMapper() {
        PersonaDTO dto = PersonaDTO.builder().documento("1234567-9").nombre("Juan Angel").apellido("Larrayoz da Rosa").build();

        Persona entity = modelMapper.map(dto, Persona.class);

        assertEquals(dto.getDocumento(), entity.getDocumento());
        assertEquals(dto.getNombre(), entity.getNombre());
        assertEquals(dto.getApellido(), entity.getApellido());
    }

    @Test
    public void testInsertPersonaDtoMapper() {
        UpdatePersonaDTO dto = UpdatePersonaDTO.builder().id(1L).documento("1234567-9").nombre("Juan Angel").apellido("Larrayoz da Rosa").build();

        Persona entity = modelMapper.map(dto, Persona.class);

        assertEquals(dto.getDocumento(), entity.getDocumento());
        assertEquals(dto.getNombre(), entity.getNombre());
        assertEquals(dto.getApellido(), entity.getApellido());
    }
}
