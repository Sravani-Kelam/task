package com.shift.management.shift.management.controller;

import com.shift.management.shift.management.dto.ShiftDto;
import com.shift.management.shift.management.dto.UserDto;
import com.shift.management.shift.management.service.ShiftImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shift")
public class ShiftController {

    @Autowired
    private ShiftImpl shiftImpl;

    @PostMapping("/saveshift")
    public ResponseEntity<ShiftDto> saveShift(@RequestBody ShiftDto shiftDto) {
        ShiftDto savedShift = shiftImpl.saveShift(shiftDto);
        return new ResponseEntity<>(savedShift, HttpStatus.CREATED);
    }
}