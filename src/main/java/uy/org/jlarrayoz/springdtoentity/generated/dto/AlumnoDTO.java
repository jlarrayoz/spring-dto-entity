package uy.org.jlarrayoz.springdtoentity.generated.dto;

import uy.org.jlarrayoz.springdtoentity.generated.dto.*;
import jakarta.persistence.*;
import com.uy.jlarrayoz.genericrestapi.dto.BaseGenericDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoDTO implements BaseGenericDTO {

	@Id
	private Long id;

	private String nombre;

	private StudentDTO estudiante;

}