package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            return new ArrayList<>(new BulldozerProducer().get());
        }
        if (type.equals(Excavator.class)) {
            return new ArrayList<>(new ExcavatorProducer().get());
        }
        if (type.equals(Track.class)) {
            return new ArrayList<>(new TrackProducer().get());
        }
        return null;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int p = machines.size();
        for (int i = 0; i < p; i++) {
            machines.add(0, value);
        }
    }
    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
