package uy.org.jlarrayoz.springdtoentity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uy.org.jlarrayoz.springdtoentity.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
