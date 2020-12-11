package ru.skillfactory.service;

import org.springframework.stereotype.Service;
import ru.skillfactory.entity.ICar;

@Service
public class GibddService {

    public void checkSpeed(ICar iCar) {
        if (Float.compare(iCar.getSpeed(), 70.0F) > 0) {
            System.out.println("Данный автомобиль нарушает скоростной режим");
        } else {
            System.out.println("Данный автомобиль соблюдает скоростной режим");
        }
    }
}
