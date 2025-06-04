package com.shift.management.shift.management.dto;

import java.util.Objects;

public class ShiftDto {

    private Long id;
    private String date;
    private String time;

    public ShiftDto(Long id, String date, String time) {
        this.id = id;
        this.date = date;
        this.time = time;
    }

    public ShiftDto() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ShiftDto shiftDto = (ShiftDto) o;
        return Objects.equals(id, shiftDto.id) && Objects.equals(date, shiftDto.date) && Objects.equals(time, shiftDto.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, time);
    }

    @Override
    public String toString() {
        return "ShiftDto{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
