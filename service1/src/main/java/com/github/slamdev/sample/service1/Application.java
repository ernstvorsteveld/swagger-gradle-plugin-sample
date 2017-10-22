package com.github.slamdev.sample.service1;

import com.github.slamdev.sample.service1.api.SampleService1Api;
import com.github.slamdev.sample.service1.api.Value;
import com.github.slamdev.sample.service2.api.Key;
import com.github.slamdev.sample.service2.api.SampleService2Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.List;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class Application implements SampleService1Api {

    private final SampleService2Api sampleService2Api;

    public static void main(String[] args) {
        run(Application.class, args);
    }

    @Autowired
    public Application(SampleService2Api sampleService2Api) {
        this.sampleService2Api = sampleService2Api;
    }

    @Override
    public Value createValue(Long id, Value value) {
        sampleService2Api.createKey(1L, Key.builder().build());
        return Value.builder().build();
    }

    @Override
    public List<Value> getValues(Long id) {
        return Collections.emptyList();
    }
}
