package kuliah.uts.airplane.repository;

import kuliah.uts.airplane.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, String> {
}
