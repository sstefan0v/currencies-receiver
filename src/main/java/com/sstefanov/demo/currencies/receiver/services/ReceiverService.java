package com.sstefanov.demo.currencies.receiver.services;

import com.sstefanov.demo.currencies.receiver.json.Wrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReceiverService {

    @Autowired
    private JsonMapperService jsonMapperService;

    public  void handleMessage(String jsonString ) {
        Wrapper wr = jsonMapperService.toObject(jsonString);
    }

}