package uy.org.jlarrayoz.springdtoentity.entity;

import com.uy.jlarrayoz.genericrestapi.annotation.GenericDtoType;
import com.uy.jlarrayoz.genericrestapi.entity.BaseGenericEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uy.org.jlarrayoz.springdtoentity.dto.TipoDocumentoDTO;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@GenericDtoType(queryDTO = TipoDocumentoDTO.class, insertDTO = TipoDocumentoDTO.class, updateDTO = TipoDocumentoDTO.class)
public class TipoDocumento extends BaseGenericEntity {

    private String nombre;

}
