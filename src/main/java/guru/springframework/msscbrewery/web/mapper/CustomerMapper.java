package guru.springframework.msscbrewery.web.mapper;

import guru.springframework.msscbrewery.domain.Customer;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    public Customer customerDtoToCustomer(CustomerDto dto);
    public CustomerDto customerToCustomerDto(Customer customer);


}
