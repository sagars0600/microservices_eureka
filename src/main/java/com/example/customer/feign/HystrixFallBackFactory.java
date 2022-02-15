package com.example.customer.feign;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixFallBackFactory implements FallbackFactory<FeignCustomer> {
    @Override
    public FeignCustomer create(Throwable cause) {
        return null;
    }
}
