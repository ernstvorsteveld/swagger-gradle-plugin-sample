package com.github.slamdev.producer;

import com.github.slamdev.producer.api.Name;
import com.github.slamdev.producer.api.ProducerApi;
import com.github.slamdev.producer.api.Value;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import static java.util.Collections.singletonList;

@Component
public class ApiProcessor implements ProducerApi {

    @Override
    public Value createValue(Value value) {
        value.setUuid(UUID.randomUUID());
        return value;
    }

    @Override
    public List<Value> getValues(Long id) {
        return singletonList(Value.builder()
                .created(Instant.now())
                .eventType(Value.EventType.A)
                .name(Name.FIRST)
                .uuid(UUID.randomUUID())
                .value("test")
                .build());
    }
}
