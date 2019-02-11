package com.example.demo.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class RaveUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public RaveUserDetailsService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = this.userRepository.findByUsername(username);

        if(null==user){

            throw new UsernameNotFoundException("Not find username: " + username);
        }

        return new RaveUserPrincipal(user);
    }
}
