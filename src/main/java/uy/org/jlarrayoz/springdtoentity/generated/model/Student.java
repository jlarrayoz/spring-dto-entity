package uy.org.jlarrayoz.springdtoentity.generated.model;

import java.util.List;
import uy.org.jlarrayoz.springdtoentity.generated.model.Alumno;
import uy.org.jlarrayoz.springdtoentity.generated.dto.StudentDTO;
import jakarta.persistence.*;
import com.uy.jlarrayoz.genericrestapi.entity.BaseGenericEntity;
import com.uy.jlarrayoz.genericrestapi.annotation.GenericDtoType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@GenericDtoType(queryDTO = StudentDTO.class, insertDTO = StudentDTO.class, updateDTO = StudentDTO.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Student extends BaseGenericEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToMany
	@JoinColumn
	private List<Alumno> personas;

}