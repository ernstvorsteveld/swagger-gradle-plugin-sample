package com.github.slamdev.producer.api.client;

import com.github.slamdev.producer.api.client.Cat;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.*;
import java.net.URI;

@javax.annotation.Generated(value = "com.github.slamdev.swagger.CustomJavaCodegen", date = "2017-05-22T11:39:56.688+02:00")
public class ProducerCatsApi {

    private final RestTemplate restTemplate;

    public ProducerCatsApi(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private URI expand(String url, Map<String, Object> uriVariables) {
        URI uri = restTemplate.getUriTemplateHandler().expand(url, uriVariables);
        UriComponentsBuilder builder = UriComponentsBuilder.fromUri(uri);
        uriVariables.forEach((name, value) -> {
            if (value == null) {
                builder.replaceQueryParam(name);
            }
        });
        return builder.build(true).toUri();
    }

  
    /**
     * 
     * 
     * @param id  (required)
     * @return Cat
     */
    public ResponseEntity<Cat> getCatResponse(
        Long id
    ) {
        String _url = "/cat/{id}";
        HttpMethod _method = HttpMethod.GET;
        HttpHeaders _headers = new HttpHeaders();
        _headers.setContentType(MediaType.parseMediaType("application/json"));
        _headers.setAccept(Collections.singletonList(MediaType.parseMediaType("application/json")));
        Object _body = null;
        LinkedMultiValueMap<String, Object> _form = new LinkedMultiValueMap<>();
        HttpEntity<Object> _entity = new HttpEntity<>(_form.isEmpty() ? _body : _form, _headers);
        Map<String, Object> _uriVariables = new HashMap<>();
        _uriVariables.put("id", id);
        Class<Cat> _responseType = Cat.class;
        return restTemplate.exchange(expand(_url, _uriVariables), _method, _entity, _responseType);
    }

    /**
     * 
     * 
     * @param id  (required)
     * @return Cat
     */
    public Cat getCat(
        Long id
    ) {
        ResponseEntity<Cat> response = getCatResponse(id);
        return response.getBody();
    }
}
