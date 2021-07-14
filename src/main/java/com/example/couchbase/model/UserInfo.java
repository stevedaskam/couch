package com.example.couchbase.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.index.QueryIndexed;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class UserInfo {
    @Id
    private String id;
    @QueryIndexed
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
