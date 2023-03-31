package com.techprimers.jaegerclient.config;

import io.jaegertracing.internal.JaegerTracer;
import io.jaegertracing.internal.samplers.ConstSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class JaegerConfig {


  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

}
