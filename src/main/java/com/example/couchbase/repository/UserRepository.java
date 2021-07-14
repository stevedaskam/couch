package com.example.couchbase.repository;

import com.example.couchbase.model.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, String> {
    List<UserInfo> findByName(String name);
}
