package com.github.slamdev.producer.api;

import com.github.slamdev.producer.api.Cat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.http.HttpStatus.OK;

@javax.annotation.Generated(value = "com.github.slamdev.swagger.CustomJavaCodegen", date = "2017-05-22T13:13:24.530+02:00")
@RestController
@RequestMapping
public interface ProducerCatsApi {

    @RequestMapping(value = "/api/cat/{id}",
        method = RequestMethod.GET
    )
    default ResponseEntity<Cat> getCatApi(@PathVariable("id") Long id) {
        return toResponse(getCat(id));
    }

    Cat getCat(Long id);

    default <T> ResponseEntity<T> toResponse(T result) {
        return new ResponseEntity<>(result, OK);
    }

    default ResponseEntity<Void> toResponse() {
        return new ResponseEntity<Void>(OK);
    }
}
