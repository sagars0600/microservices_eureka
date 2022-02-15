package com.example.customer.feign;


import com.example.customer.model.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="account-sql",fallbackFactory = HystrixFallBackFactory.class)
public interface FeignCustomer {

    @GetMapping("/account/accounts/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable("id") Integer id);
}
