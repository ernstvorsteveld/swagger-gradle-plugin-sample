package com.github.slamdev.consumer;

import com.github.slamdev.producer.api.client.ProducerApi;
import com.github.slamdev.producer.api.client.ProducerCatsApi;
import com.github.slamdev.producer.api.client.ProducerDogsApi;
import com.github.slamdev.producer.api.client.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Autowired
    private ProducerApi producerApi;

    @Autowired
    private ProducerCatsApi producerCatsApi;

    @Autowired
    private ProducerDogsApi producerDogsApi;

    public void testApiCalls() {
        producerApi.createValue(Value.builder().build());
        producerApi.getValues(1L);
        producerCatsApi.getCat(1L);
        producerDogsApi.getDog(1L);
    }
}
