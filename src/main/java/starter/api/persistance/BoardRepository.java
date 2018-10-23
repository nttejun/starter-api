package starter.api.persistance;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import starter.api.entity.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {
    @Query("SELECT max(b.no) FROM Board b ORDER BY b.no DESC")
    long getBoardNo();
}
