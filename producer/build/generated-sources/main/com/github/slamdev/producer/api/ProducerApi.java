package com.github.slamdev.producer.api;

import com.github.slamdev.producer.api.Value;

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
public interface ProducerApi {

    @RequestMapping(value = "/api/values/{id}",
        method = RequestMethod.POST
    )
    default ResponseEntity<Value> createValueApi(@RequestBody Value value) {
        return toResponse(createValue(value));
    }

    Value createValue(Value value);

    @RequestMapping(value = "/api/values/{id}",
        method = RequestMethod.GET
    )
    default ResponseEntity<List<Value>> getValuesApi(@PathVariable("id") Long id) {
        return toResponse(getValues(id));
    }

    List<Value> getValues(Long id);

    default <T> ResponseEntity<T> toResponse(T result) {
        return new ResponseEntity<>(result, OK);
    }

    default ResponseEntity<Void> toResponse() {
        return new ResponseEntity<Void>(OK);
    }
}
