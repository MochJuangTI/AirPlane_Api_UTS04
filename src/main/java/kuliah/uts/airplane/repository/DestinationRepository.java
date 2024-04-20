package kuliah.uts.airplane.repository;

import kuliah.uts.airplane.entity.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination, String> {
}
