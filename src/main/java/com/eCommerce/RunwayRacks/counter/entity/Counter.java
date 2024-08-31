package com.eCommerce.RunwayRacks.counter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Counter {
    private String className;
    private long currentId;


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public long getCurrentId() {
        return currentId;
    }

    public void setCurrentId(long currentId) {
        this.currentId = currentId;
    }
}
