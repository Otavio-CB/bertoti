package org.rest;

public class PlaneWay implements Way{
    @Override
    public void execute() {
        System.out.println("the way is through the air");
    }
}
