package uy.org.jlarrayoz.springdtoentity.generic.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import uy.org.jlarrayoz.springdtoentity.generic.entity.BaseEntity;
import uy.org.jlarrayoz.springdtoentity.generic.repository.BaseRepository;

import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true)
public class BaseService<T extends BaseEntity> {

    private final BaseRepository<T> repository;

    public BaseService(BaseRepository<T> repository) {
        this.repository = repository;
    }

    public List<T> findAll(){
        return repository.findAll();
    }

    public List<T> findAll(Sort sort){
        return repository.findAll(sort);
    }

    public Page<T> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }

    public Optional<T> findById(Long id){
        return repository.findById(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public T save(T entity){
        return repository.save(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public List<T> save(Iterable<T> entities){
        return repository.saveAll(entities);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
