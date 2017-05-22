package com.github.slamdev.producer;

import com.github.slamdev.producer.api.Dog;
import com.github.slamdev.producer.api.ProducerDogsApi;
import org.springframework.stereotype.Component;

@Component
public class DogsApiProcessor implements ProducerDogsApi {

    @Override
    public Dog getDog(Long id) {
        return Dog.builder()
                .value(id.toString())
                .build();
    }
}
