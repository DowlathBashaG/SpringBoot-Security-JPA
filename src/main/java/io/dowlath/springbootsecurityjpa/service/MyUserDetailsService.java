package io.dowlath.springbootsecurityjpa.service;

import io.dowlath.springbootsecurityjpa.model.MyUserDetails;
import io.dowlath.springbootsecurityjpa.model.User;
import io.dowlath.springbootsecurityjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author Dowlath
 * @create 7/12/2020 5:12 PM
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user= userRepository.findByUserName(userName);
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: "+ userName));
        return user.map(MyUserDetails::new).get();

    }
}
