package com.eCommerce.RunwayRacks.counter.dao;

import com.eCommerce.RunwayRacks.counter.constants.CounterRepositoryPortletKeys;
import com.eCommerce.RunwayRacks.counter.entity.Counter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class CounterRepositoryServiceImpl implements CounterRepository {
    private static final Logger log = LoggerFactory.getLogger(CounterRepositoryServiceImpl.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * @param className
     * @param currentId
     * @return Counter
     */
    @Override
    public boolean createCounter(String className, long currentId) {
        try {
            jdbcTemplate.update(CounterRepositoryPortletKeys.getCreateCounter(), className, currentId);
            return true;
        } catch (Exception e) {
            log.error("Error While Creating the counter with the class Name {} ", className);
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * @param className
     * @param currentId
     * @return Counter
     */
    @Override
    public boolean updateCounter(String className, long currentId) {
        try {
            jdbcTemplate.update(CounterRepositoryPortletKeys.getUpdateCounterByClassname(), currentId, className);
            return true;
        } catch (Exception e) {
            log.error("Error While Updating the counter with the class Name {} ", className);
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
        }

        return false;
    }

    /**
     * @param className
     * @return Counter
     */
    @Override
    public Counter getCounter(String className) {
        List<Counter> counterList = new ArrayList<>();
        Counter counter = null;
        try {
            counterList = jdbcTemplate.query(CounterRepositoryPortletKeys.getGetCounterByClassname(), mapper, className);
            System.out.println("counterList       " + counterList);
            if (!counterList.isEmpty()) {

                counter = counterList.getFirst();
            }
        } catch (Exception e) {
            log.error("Error While getting the counter with the class Name {} ", className);
            if (log.isDebugEnabled()) {
                e.printStackTrace();
            }
        }
        return counter;
    }

    /**
     * @return List<Counter>
     */
    @Override
    public List<Counter> getCounterList() {
        return List.of();
    }

    /**
     * @param className
     * @return long
     */
    @Override
    public long increment(String className) {
        long incrementalID = 0;
        Counter counter = null;
        try {
            counter = getCounter(className);
            if (counter == null) {
                // No counter found, create a new one starting from 1
                incrementalID = 1;
                boolean createFlag = createCounter(className, incrementalID);
                if (!createFlag) {
                    throw new RuntimeException("Failed to create a new counter for class: " + className);
                }
            } else {
                // Counter exists, increment the currentId
                long currentIdStr = counter.getCurrentId();
                incrementalID = currentIdStr + 1;
                boolean updateFlag = updateCounter(className, incrementalID);
                if (!updateFlag) {
                    throw new RuntimeException("Failed to update the counter for class: " + className);
                }
            }
        } catch (Exception e) {
            log.error("Error while incrementing the counter with the class Name {} ", className, e);
        }
        return incrementalID;
    }


    RowMapper<Counter> mapper = new RowMapper<Counter>() {
        @Override
        public Counter mapRow(ResultSet rs, int rowNum) throws SQLException {
            Counter counter = new Counter();
            counter.setClassName(rs.getString("className"));
            counter.setCurrentId(rs.getLong("currentId"));
            System.out.println(rs.getString("className") + " rs.getString(className)");
            System.out.println(rs.getLong("currentId") + " rs.getLong(currentId)");
            return counter;
        }
    };
}
