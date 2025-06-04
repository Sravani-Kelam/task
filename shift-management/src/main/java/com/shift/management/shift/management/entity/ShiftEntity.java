package com.shift.management.shift.management.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "shift")
public class ShiftEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private String time;

    public ShiftEntity(Long id, String date, String time) {
        this.id = id;
        this.date = date;
        this.time = time;
    }

    public ShiftEntity() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ShiftEntity that = (ShiftEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(date, that.date) && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, time);
    }

    @Override
    public String toString() {
        return "ShiftEntity{" +
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
