package com.shift.management.shift.management.service;

import com.shift.management.shift.management.dto.UserDto;
import com.shift.management.shift.management.entity.UserEntity;
import com.shift.management.shift.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service

public class UserImpl implements UserDetailsService {
    
    @Override
    public UserDetails loadUserById(Long id) {
        return null;
    }

    @Autowired
    private UserRepository userRepository;

    public  UserDto saveUser(UserDto userDto){
        UserEntity userEntity=new UserEntity(
                userDto.getId(),
                userDto.getUsername(),
                userDto.getPassword(),
                userDto.getRole()
        );
        UserEntity userEntity1=userRepository.save(userEntity);
        UserDto saveUserDto=new UserDto(
                userEntity1.getId(),
                userEntity1.getUsername(),
                userEntity1.getPassword(),
                userEntity1.getRole()
        );
        return saveUserDto;
    }

}
