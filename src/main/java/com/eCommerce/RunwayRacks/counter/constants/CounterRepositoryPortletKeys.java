package com.eCommerce.RunwayRacks.counter.constants;

public class CounterRepositoryPortletKeys {
    private static String CREATE_COUNTER = "INSERT INTO runwayracks.counter (className,currentId) VALUES(?, ?)";
    private static String UPDATE_COUNTER_BY_CLASSNAME = "UPDATE runwayracks.counter SET currentId=? WHERE className=?";
    private static String GET_COUNTER_BY_CLASSNAME = "SELECT * FROM runwayracks.counter WHERE className=?";

    public static String getCreateCounter() {
        return CREATE_COUNTER;
    }

    public static String getUpdateCounterByClassname() {
        return UPDATE_COUNTER_BY_CLASSNAME;
    }

    public static String getGetCounterByClassname() {
        return GET_COUNTER_BY_CLASSNAME;
    }
}
