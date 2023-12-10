package uy.org.jlarrayoz.springdtoentity.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uy.org.jlarrayoz.springdtoentity.dto.PersonaDTO;
import uy.org.jlarrayoz.springdtoentity.dto.UpdatePersonaDTO;
import uy.org.jlarrayoz.springdtoentity.generic.annotation.GenericDtoType;
import uy.org.jlarrayoz.springdtoentity.generic.entity.BaseEntity;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@GenericDtoType(queryDTO = PersonaDTO.class, insertDTO = PersonaDTO.class, updateDTO = UpdatePersonaDTO.class)
public class Persona extends BaseEntity {

    @NotNull
    @Column(length = 10)
    private String documento;

    @NotNull
    @NotEmpty
    @Column(length = 40)
    private String nombre;

    @NotNull
    @NotEmpty
    @Column(length = 40)
    private String apellido;

    @ManyToOne(fetch = FetchType.LAZY)
    private TipoDocumento tipoDocumento;

}
