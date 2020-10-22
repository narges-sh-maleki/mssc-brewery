package guru.springframework.msscbrewery.service;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface CustomerService {

    public CustomerDto getCustomer(UUID customerId);

    public CustomerDto saveCustomer(UUID customerId, CustomerDto customerDto);

    public CustomerDto updateCustomer(UUID customerId, CustomerDto customerDto);

    public void deleteCustomer(UUID customerId);
}
