package kuliah.uts.airplane.controller;

import kuliah.uts.airplane.entity.Customer;
import kuliah.uts.airplane.model.LoginCustomerRequest;
import kuliah.uts.airplane.model.RegisterCustomerRequest;
import kuliah.uts.airplane.model.WebResponse;
import kuliah.uts.airplane.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PutMapping(
            path = "/customer/register",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<Customer> register(@RequestBody RegisterCustomerRequest request) {
        Customer customer = customerService.register(request);
        return WebResponse.<Customer>builder().data(customer).build();
    }

    @PostMapping(
            path = "/customer/login",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<Customer> login(@RequestBody LoginCustomerRequest request) {
        Customer customer = customerService.login(request);
        return WebResponse.<Customer>builder().data(customer).build();
    }
}
