package com.example.customer.controller;

import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.HttpMethod;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/viewacc")
    public String getAccount() {
        /*return restTemplate.exchange("http://account/accounts",String.class).getBody();*/
        return restTemplate.getForObject("http://account/accounts",String.class);
    }



    @PostMapping("/customer")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

    @GetMapping("/customers")
    public List<Customer> getCustomer(){
        return customerService.getCustomer();
    }


}
