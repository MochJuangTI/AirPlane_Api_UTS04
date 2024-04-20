package kuliah.uts.airplane.repository;

import kuliah.uts.airplane.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
