package com.thehecklers.aircraftfn;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface AircraftRepository extends Neo4jRepository<Aircraft, Long> {
}
