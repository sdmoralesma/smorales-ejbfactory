package com.smorales.ejb.cars;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Lamborgini implements Car {

    @Override
    public String uname() {
        return "Lamborgini";
    }
}
