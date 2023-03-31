package com.techprimers.jaegerserver.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JaegerServerService {

  private RestTemplate restTemplate;

  public JaegerServerService(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  public String get(Integer id) {

    return
    restTemplate.getForObject("http://numbersapi.com/" + id,String.class);
  }
}
