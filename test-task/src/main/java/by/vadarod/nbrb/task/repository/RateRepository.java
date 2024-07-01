package by.vadarod.nbrb.task.repository;

import by.vadarod.nbrb.task.model.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateRepository extends JpaRepository<Rate,Long> {

}
