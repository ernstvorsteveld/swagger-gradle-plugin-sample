package com.github.slamdev.sample.service2;

import com.github.slamdev.sample.service1.api.SampleService1Api;
import com.github.slamdev.sample.service2.api.Key;
import com.github.slamdev.sample.service2.api.SampleService2Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.List;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class Application implements SampleService2Api {

    private final SampleService1Api sampleService1Api;

    public static void main(String[] args) {
        run(Application.class, args);
    }

    @Autowired
    public Application(SampleService1Api sampleService1Api) {
        this.sampleService1Api = sampleService1Api;
    }

    @Override
    public Key createKey(Long id, Key key) {
        return Key.builder().build();
    }

    @Override
    public List<Key> getKeys(Long id) {
        sampleService1Api.getValues(1L);
        return Collections.emptyList();
    }
}
