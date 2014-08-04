package com.smorales.ejb.cars;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;

@Stateless
public class CarFactory  {

    private static boolean condition = true;

    @EJB(beanName = "Ferrari")
    Ferrari ferrari;

    @EJB(beanName = "Lamborgini")
    Lamborgini lamborgini;

    @Produces @CarModel(CarModel.Brand.FERRARI)
    public Car pimpMyRideA() {
        return ferrari;
    }

    @Produces @CarModel(CarModel.Brand.LAMBORGINI)
    public Car pimpMyRideB() {
        return lamborgini;
    }


//        CarModel.Brand brand = point.getAnnotated().getAnnotation(CarModel.class).value();
//        switch (brand) {
//            case FERRARI:
//            case LAMBORGINI:
//                return lamborgini;
//            default:
//                throw new IllegalArgumentException("Select a type of Car");
//        }
}
