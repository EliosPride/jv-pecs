package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bull = new ArrayList<>();
        bull.add(new Bulldozer("bobik", "yellow", "2", "2"));
        bull.add(new Bulldozer("bobrik", "red","22", "22"));
        bull.add(new Bulldozer("bobrik", "red","22", "222"));
        return bull;
    }
}
