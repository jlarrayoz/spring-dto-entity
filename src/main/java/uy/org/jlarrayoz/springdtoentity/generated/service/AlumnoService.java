package uy.org.jlarrayoz.springdtoentity.generated.service;

import uy.org.jlarrayoz.springdtoentity.generated.model.Alumno;
import uy.org.jlarrayoz.springdtoentity.generated.repository.AlumnoRepository;
import org.springframework.stereotype.Service;
import com.uy.jlarrayoz.genericrestapi.service.BaseGenericService;

@Service
public class AlumnoService extends BaseGenericService<Alumno, Long> {

	private AlumnoRepository repository;

	public AlumnoService(AlumnoRepository repository) {
		super(repository);
		this.repository = repository;
	}
}