package torimia.superheroes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import torimia.superheroes.model.Friend;
import torimia.superheroes.model.Superhero;

import java.util.List;

@Repository
public interface FriendRepo extends JpaRepository<Friend, Long> {

    List<Friend> findAllBySuperheroId(Long superheroId);

    void deleteBySuperheroAndFriendName(Superhero superhero, String friendName);



//    SELECT superhero.name, COUNT(superhero.id) FROM public.superhero
//    JOIN public.friend ON (superhero.id = friend.superhero_id)
//    GROUP BY superhero.name
//    ORDER BY COUNT(superhero.id) DESC
//    LIMIT 5

}
