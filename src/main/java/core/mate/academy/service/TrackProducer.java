package core.mate.academy.service;

import core.mate.academy.model.Track;

import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        List<Track> trc = new ArrayList<>();
        trc.add(new Track("Vors", "blue", "22", "12"));
        trc.add(new Track("Blin", "orange", "1222", "122"));
        trc.add(new Track("Bflin", "orange", "12222", "122"));
        return trc;
    }
}
