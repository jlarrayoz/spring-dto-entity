package uy.org.jlarrayoz.springdtoentity.generated.service;

import uy.org.jlarrayoz.springdtoentity.generated.model.Student;
import uy.org.jlarrayoz.springdtoentity.generated.repository.StudentRepository;
import org.springframework.stereotype.Service;
import com.uy.jlarrayoz.genericrestapi.service.BaseGenericService;

@Service
public class StudentService extends BaseGenericService<Student, Long> {

	private StudentRepository repository;

	public StudentService(StudentRepository repository) {
		super(repository);
		this.repository = repository;
	}

	public Student findStudentById(Long id) {
		return repository.findStudentById(id);
	}

}