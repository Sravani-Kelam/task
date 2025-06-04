package com.shift.management.shift.management.service;

import com.shift.management.shift.management.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {

UserDto saveUser(UserDto userDto);

    default UserDetailsService loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    UserDetails loadUserById(Long id);
}
