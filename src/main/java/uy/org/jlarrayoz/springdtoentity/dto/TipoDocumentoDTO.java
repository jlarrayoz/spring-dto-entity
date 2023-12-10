package uy.org.jlarrayoz.springdtoentity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uy.org.jlarrayoz.springdtoentity.generic.dto.BaseGenericDTO;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoDocumentoDTO implements BaseGenericDTO {
    private Long id;
    private String nombre;
}
