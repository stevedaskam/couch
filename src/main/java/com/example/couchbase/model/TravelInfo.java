package com.example.couchbase.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class TravelInfo {
    @Id
    private String id;
    @Field
    private String callsign;
    @Field
    private String country;
    @Field
    private String iata;
    @Field
    private String icao;
    @Field
    private String name;
    @Field
    private String type;

    public String getCallsign() {
        return callsign;
    }

    public String getCountry() {
        return country;
    }

    public String getIata() {
        return iata;
    }

    public String getIcao() {
        return icao;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
