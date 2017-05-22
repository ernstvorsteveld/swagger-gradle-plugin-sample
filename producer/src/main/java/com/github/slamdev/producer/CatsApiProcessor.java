package com.github.slamdev.producer;

import com.github.slamdev.producer.api.Cat;
import com.github.slamdev.producer.api.ProducerCatsApi;
import org.springframework.stereotype.Component;

@Component
public class CatsApiProcessor implements ProducerCatsApi {

    @Override
    public Cat getCat(Long id) {
        return Cat.builder()
                .value(id.toString())
                .build();
    }
}
