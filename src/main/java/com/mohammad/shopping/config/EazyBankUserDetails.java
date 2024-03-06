package com.mohammad.shopping.config;

import com.mohammad.shopping.model.Customer;
import com.mohammad.shopping.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EazyBankUserDetails implements UserDetailsService {

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        String userName,password = null;
        List<GrantedAuthority> authorityList = null;
        List<Customer> customerList = customerRepository.findByEmail(username);

        if(customerList.size() == 0){
            throw new UsernameNotFoundException("User Details not found for the user"+username);
        } else {
            userName = customerList.get(0).getEmail();
            password = customerList.get(0).getPwd();
            authorityList = new ArrayList<>();
            authorityList.add(new SimpleGrantedAuthority(customerList.get(0).getRole()));
        }

        return new User(username,password,authorityList);

    }
}
