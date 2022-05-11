package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> exc = new ArrayList<>();
        exc.add(new Excavator("Anton", "green", "12", "122"));
        exc.add(new Excavator("Andrey", "grey", "12", "122"));
        exc.add(new Excavator("Andrey", "grey", "1432", "123"));
        return exc;
    }
}
