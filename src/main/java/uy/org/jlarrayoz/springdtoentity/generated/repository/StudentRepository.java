package uy.org.jlarrayoz.springdtoentity.generated.repository;

import uy.org.jlarrayoz.springdtoentity.generated.model.Student;
import org.springframework.stereotype.Repository;
import com.uy.jlarrayoz.genericrestapi.repository.BaseGenericRepository;

@Repository
public interface StudentRepository extends BaseGenericRepository<Student, Long> {


	Student findStudentById(Long id);

}