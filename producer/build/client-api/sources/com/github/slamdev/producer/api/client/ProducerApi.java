package com.github.slamdev.producer.api.client;

import com.github.slamdev.producer.api.client.Value;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.util.*;
import java.net.URI;

@javax.annotation.Generated(value = "com.github.slamdev.swagger.CustomJavaCodegen", date = "2017-05-22T11:39:56.688+02:00")
public class ProducerApi {

    private final RestTemplate restTemplate;

    public ProducerApi(RestTemplate restTemplate) {
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
     * @param value  (required)
     * @return Value
     */
    public ResponseEntity<Value> createValueResponse(
        Value value
    ) {
        String _url = "/values/{id}";
        HttpMethod _method = HttpMethod.POST;
        HttpHeaders _headers = new HttpHeaders();
        _headers.setContentType(MediaType.parseMediaType("application/json"));
        _headers.setAccept(Collections.singletonList(MediaType.parseMediaType("application/json")));
        Object _body = null;
        _body = value;
        LinkedMultiValueMap<String, Object> _form = new LinkedMultiValueMap<>();
        HttpEntity<Object> _entity = new HttpEntity<>(_form.isEmpty() ? _body : _form, _headers);
        Map<String, Object> _uriVariables = new HashMap<>();
        Class<Value> _responseType = Value.class;
        return restTemplate.exchange(expand(_url, _uriVariables), _method, _entity, _responseType);
    }

    /**
     * 
     * 
     * @param value  (required)
     * @return Value
     */
    public Value createValue(
        Value value
    ) {
        ResponseEntity<Value> response = createValueResponse(value);
        return response.getBody();
    }

    /**
     * 
     * 
     * @param id  (required)
     * @return List<Value>
     */
    public ResponseEntity<List<Value>> getValuesResponse(
        Long id
    ) {
        String _url = "/values/{id}";
        HttpMethod _method = HttpMethod.GET;
        HttpHeaders _headers = new HttpHeaders();
        _headers.setContentType(MediaType.parseMediaType("application/json"));
        _headers.setAccept(Collections.singletonList(MediaType.parseMediaType("application/json")));
        Object _body = null;
        LinkedMultiValueMap<String, Object> _form = new LinkedMultiValueMap<>();
        HttpEntity<Object> _entity = new HttpEntity<>(_form.isEmpty() ? _body : _form, _headers);
        Map<String, Object> _uriVariables = new HashMap<>();
        _uriVariables.put("id", id);
        ParameterizedTypeReference<List<Value>> _responseType = new ParameterizedTypeReference<List<Value>>() {};
        return restTemplate.exchange(expand(_url, _uriVariables), _method, _entity, _responseType);
    }

    /**
     * 
     * 
     * @param id  (required)
     * @return List<Value>
     */
    public List<Value> getValues(
        Long id
    ) {
        ResponseEntity<List<Value>> response = getValuesResponse(id);
        return response.getBody();
    }
}
