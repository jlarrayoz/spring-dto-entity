package uy.org.jlarrayoz.springdtoentity.generic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import uy.org.jlarrayoz.springdtoentity.generic.entity.BaseEntity;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T, Serializable> {
}
