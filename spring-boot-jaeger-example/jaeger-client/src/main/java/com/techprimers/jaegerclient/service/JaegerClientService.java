package com.techprimers.jaegerclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class JaegerClientService {

  private RestTemplate restTemplate;
  private  final  String baseUrl;

  public JaegerClientService(RestTemplate restTemplate,@Value("${jaegerserver.baseUrl}") String baseUrl) {

    this.baseUrl = baseUrl;
    this.restTemplate = restTemplate;
  }

  public String get(Integer id) {

    return    restTemplate.getForObject(baseUrl + id, String.class);

  }
}
