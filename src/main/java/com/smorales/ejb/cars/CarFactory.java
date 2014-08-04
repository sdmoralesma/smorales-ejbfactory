package com.smorales.ejb.cars;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;

@Stateless
public class CarFactory {

    @EJB(beanName = "Ferrari")
    Ferrari ferrari;

    @EJB(beanName = "Lamborgini")
    Lamborgini lamborgini;

    @Produces
    @CarModel(CarModel.Brand.FERRARI)
    public Car pimpMyRideA() {
        return ferrari;
    }

    @Produces
    @CarModel(CarModel.Brand.LAMBORGINI)
    public Car pimpMyRideB() {
        return lamborgini;
    }
}
