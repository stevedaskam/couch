package com.example.couchbase.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.couchbase.model.TravelInfo;

import java.util.Optional;
import java.util.List;

@Repository
public interface TravelRepository extends CrudRepository<TravelInfo, Integer> {
    TravelInfo findByCallsignEquals(String callsign);

    List<TravelInfo> findByName(String name);
}
