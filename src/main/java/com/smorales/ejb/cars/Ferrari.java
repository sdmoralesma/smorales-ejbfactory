package com.smorales.ejb.cars;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Ferrari implements Car {

    @Override
    public String uname() {
        return "Ferrari";
    }
}
