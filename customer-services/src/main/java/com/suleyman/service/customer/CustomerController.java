package com.suleyman.service.customer;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value="/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(method= RequestMethod.GET)
    public List<Customer> findAll(@RequestParam(name="emailAddress", required = false)String emailAddress){
        if(StringUtils.isNotBlank(emailAddress)){
            return Collections.singletonList(this.customerRepository.findByEmailAddress(emailAddress));
        }
        return (List<Customer>) this.customerRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Customer findOne(@PathVariable(name="id")long id){
        return this.customerRepository.findById(id).get();
    }
}
