package com.pkacp.TableReservation.models;

import com.pkacp.TableReservation.models.enums.Roles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name = "dining_tables")
public class DiningTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(value = 1, message = "Table capacity cannot be less than 1")
    @Max(value = 100, message = "Table capacity cannot be greater than 100")
    private Integer size;

    @Size(max = 250)
    private String description;

    public DiningTable() {
    }

    public DiningTable(@Min(value = 1, message = "Table capacity cannot be less than 1")
                       @Max(value = 100, message = "Table capacity cannot be greater than 100") Integer size,
                       @Size(max = 250) String description) {
        this.size = size;
        this.description = description;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Dining table [id=" + id + ", size=" + size + ", desc=" + description + "]";
    }
}
