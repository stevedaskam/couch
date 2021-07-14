package com.example.couchbase;

import com.example.couchbase.model.UserInfo;
import com.example.couchbase.repository.UserRepository;
import com.example.couchbase.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;

@Configuration
public class StartupConfig {
    @Autowired
    public TravelRepository travelRepository;

    @Autowired
    public UserRepository userRepository;

    @PostConstruct
    public void postConstruct() {
        System.out.println("Processing data...");
        List<UserInfo> userInfo = userRepository.findByName("Steve");
        //List<NameInfo> nameInfo = nameRepository.findAll();
        if (userInfo.size() == 0) {
            System.out.println("No data found");
        } else {
            System.out.println("Data found: " + userInfo.get(0).getName());
        }
    }
}
