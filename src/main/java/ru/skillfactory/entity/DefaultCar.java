package ru.skillfactory.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultCar implements ICar {

    @Autowired
    private IEngine engine;

    public float getSpeed() {
        return engine.getEngineRotation() * 1.5F;
    }

    public void setPressure(final float pedalPressure) {
        engine.setFuelConsumptionRate(pedalPressure);
    }
}
