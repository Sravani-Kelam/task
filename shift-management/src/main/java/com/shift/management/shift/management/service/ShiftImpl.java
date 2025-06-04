package com.shift.management.shift.management.service;

import com.shift.management.shift.management.dto.ShiftDto;
import com.shift.management.shift.management.entity.ShiftEntity;
import com.shift.management.shift.management.repository.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShiftImpl  implements ShiftService{

    @Autowired
    private ShiftRepository shiftRepository;

    public ShiftDto saveShift(ShiftDto shiftDto){
        ShiftEntity shiftEntity=new ShiftEntity(
                shiftDto.getId(),
                shiftDto.getDate(),
                shiftDto.getTime()
        );

        ShiftEntity shiftEntity1=shiftRepository.save(shiftEntity);

        ShiftDto saveShiftDto=new ShiftDto(
                shiftEntity1.getId(),
                shiftEntity1.getDate(),
                shiftEntity1.getTime()
        );
        return saveShiftDto;
    }
}
