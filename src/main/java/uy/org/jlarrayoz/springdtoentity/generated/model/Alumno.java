package uy.org.jlarrayoz.springdtoentity.generated.model;

import uy.org.jlarrayoz.springdtoentity.generated.model.Student;
import uy.org.jlarrayoz.springdtoentity.generated.dto.AlumnoDTO;
import jakarta.persistence.*;
import com.uy.jlarrayoz.genericrestapi.entity.BaseGenericEntity;
import com.uy.jlarrayoz.genericrestapi.annotation.GenericDtoType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@GenericDtoType(queryDTO = AlumnoDTO.class, insertDTO = AlumnoDTO.class, updateDTO = AlumnoDTO.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Alumno extends BaseGenericEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nombre;

	@OneToOne
	private Student estudiante;

}