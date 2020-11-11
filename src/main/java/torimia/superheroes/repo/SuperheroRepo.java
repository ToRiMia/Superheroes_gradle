package torimia.superheroes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import torimia.superheroes.model.Superhero;

@Repository
public interface SuperheroRepo extends JpaRepository<Superhero, Long> {

}
