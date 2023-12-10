package uy.org.jlarrayoz.springdtoentity.dto;

import com.uy.jlarrayoz.genericrestapi.dto.BaseGenericDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoDocumentoDTO implements BaseGenericDTO {
    private Long id;
    private String nombre;
}
