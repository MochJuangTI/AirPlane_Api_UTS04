package kuliah.uts.airplane.service;

import kuliah.uts.airplane.entity.Customer;
import kuliah.uts.airplane.model.LoginCustomerRequest;
import kuliah.uts.airplane.model.RegisterCustomerRequest;
import kuliah.uts.airplane.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public Customer register(RegisterCustomerRequest request) {
        // TODO : validation
        // TODO : filled customer data
        // TODO : create credit by customer
        Customer customer = new Customer();
        customerRepository.save(customer);
        return customer;
    }

    public Customer login(LoginCustomerRequest request) {
        // TODO : validation
        // TODO : checkin data to db
        return new Customer();
    }
}
