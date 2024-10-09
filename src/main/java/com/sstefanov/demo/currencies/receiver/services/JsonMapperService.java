package com.sstefanov.demo.currencies.receiver.services;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.sstefanov.demo.currencies.receiver.json.Wrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonMapperService {

    private ObjectMapper objectMapper;

    @Autowired
    private JsonMapperService() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
    }

    public  Wrapper toObject(String jsonString ) {
        try {

            Wrapper wrapper = objectMapper.readValue(jsonString, Wrapper.class);

            log.debug("Created POJO from json {}", wrapper);
            return wrapper;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Wrapper();
    }

}



