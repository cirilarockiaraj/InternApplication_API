package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Interns;

@Repository
public interface InternRepository extends JpaRepository<Interns, Integer> {

}
