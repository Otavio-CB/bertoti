package org.rest;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Way> ways;

    public Context() {
        ways = new HashMap<>();
        ways.put("1", new CarWay());
        ways.put("2", new PlaneWay());
        ways.put("3", new BoatWay());
    }

    public void executeWay(String wayKey){
        Way way = ways.get(wayKey);
        if (way != null) {
            way.execute();
        } else {
            throw new IllegalArgumentException("Way not found: " + wayKey);
        }
    }
}