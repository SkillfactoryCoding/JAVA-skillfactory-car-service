package ru.skillfactory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.skillfactory.entity.DefaultCar;

@Service
public class CarService {

    @Autowired
    private DefaultCar defaultCar;

    public void launchCar() {
        defaultCar.setPressure(50);
    }
}
