package com.thehecklers.aircraftfn;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class Echo implements Function<Aircraft, Aircraft> {
    private final AircraftRepository repo;

    public Echo(AircraftRepository repo) {
        this.repo = repo;
    }

    public Aircraft apply(Aircraft ac) {
        System.out.println(ac);
        //return ac.getAdshex();
        return repo.save(ac);
    }
}
