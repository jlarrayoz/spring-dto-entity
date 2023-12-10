package uy.org.jlarrayoz.springdtoentity.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uy.org.jlarrayoz.springdtoentity.dto.TipoDocumentoDTO;
import uy.org.jlarrayoz.springdtoentity.generic.annotation.GenericDtoType;
import uy.org.jlarrayoz.springdtoentity.generic.entity.BaseEntity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@GenericDtoType(queryDTO = TipoDocumentoDTO.class, insertDTO = TipoDocumentoDTO.class, updateDTO = TipoDocumentoDTO.class)
public class TipoDocumento extends BaseEntity {

    private String nombre;

}
