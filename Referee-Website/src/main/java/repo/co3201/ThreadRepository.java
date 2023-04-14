package repo.co3201;

import org.springframework.data.jpa.repository.JpaRepository;
import model.co3201.Thread;

public interface ThreadRepository extends JpaRepository<Thread, Long> {
	
}
