package com.techprimers.jaegerclient.controller;

import com.techprimers.jaegerclient.service.JaegerClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/jaeger/client")
public class JaegerClientController {

  private JaegerClientService jaegerClientService;
  private Logger logger = LoggerFactory.getLogger(Controller.class);

  public JaegerClientController(JaegerClientService jaegerClientService) {
    this.jaegerClientService = jaegerClientService;
  }

  @GetMapping("/{id}")
  public String get(@PathVariable("id") Integer id) {
    logger.info("Give me a sentence that starts with a number{}",id);
    return jaegerClientService.get(id);
  }
}
