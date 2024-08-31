package com.eCommerce.RunwayRacks.counter.dao;

import com.eCommerce.RunwayRacks.counter.entity.Counter;

import java.util.List;

public interface CounterRepository {
    boolean createCounter(String className,long currentId);
    boolean updateCounter(String className, long currentId);
    Counter getCounter(String className);
    List<Counter> getCounterList();
    long increment(String className);

}
