package com.smorales.ejb.cars;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;

@Stateless
public class CarFactory {

    @EJB(beanName = "Ferrari") // You can use the beanName or mappedName to lookup for the EJBs
    Car ferrari;

    @EJB(beanName = "Lamborgini")
    Car lamborgini;

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
