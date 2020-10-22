package guru.springframework.msscbrewery.service;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder().ID(UUID.randomUUID()).name("Narges").build();
    }

    @Override
    public CustomerDto saveCustomer(UUID customerID, CustomerDto customerDto) {
        return CustomerDto.builder().ID(UUID.randomUUID()).name("new customer").build();
    }

    @Override
    public CustomerDto updateCustomer(UUID customerID, CustomerDto customerDto) {
        return CustomerDto.builder().ID(UUID.randomUUID()).name("updated customer").build();
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("customer deleted...");
    }
}
