package com.github.slamdev.producer.api.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

class ApiConfiguration {

    private static final String BASE_PATH = "/api";

    private final String url;

    private final RestTemplate restTemplate;

    @Autowired
    public ApiConfiguration(RestTemplateBuilder restTemplateBuilder, @Value("${producer.url}") String url) {
        restTemplate = restTemplateBuilder.rootUri(strip(url) + "/" + strip(BASE_PATH)).build();
        this.url = url;
    }

    @Bean
    ProducerCatsApi provideProducerCatsApi() {
        return new ProducerCatsApi(restTemplate);
    }

    @Bean
    ProducerApi provideProducerApi() {
        return new ProducerApi(restTemplate);
    }

    @Bean
    ProducerDogsApi provideProducerDogsApi() {
        return new ProducerDogsApi(restTemplate);
    }

    private static String strip(String s) {
        return s.replaceAll("/$|^/", "");
    }
}
