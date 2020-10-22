package guru.springframework.msscbrewery.web.controller;


import guru.springframework.msscbrewery.service.CustomerService;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID customerId){
        return new ResponseEntity<>(customerService.getCustomer(customerId), HttpStatus.OK);
    }


    @PostMapping("/{customerId}")
    public ResponseEntity<CustomerDto> handlePost(@PathVariable UUID customerId, @RequestBody CustomerDto customerDto){
        CustomerDto savedCustomer = customerService.saveCustomer(customerId,customerDto);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location",  "/api/v1/customer/" + savedCustomer.getID());
        return new ResponseEntity<>(savedCustomer,httpHeaders,HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<CustomerDto> handlePut(@PathVariable UUID customerId, @RequestBody CustomerDto customerDto){
        CustomerDto updatedCustomer = customerService.updateCustomer(customerId, customerDto);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location","api/v1/customer/" + updatedCustomer.getID().toString());
        return  new ResponseEntity<>(updatedCustomer,httpHeaders,HttpStatus.OK);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable UUID customerId){
        customerService.deleteCustomer(customerId);
    }


}
