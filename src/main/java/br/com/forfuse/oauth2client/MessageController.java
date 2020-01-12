package br.com.forfuse.oauth2client;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

  @GetMapping("/api/message")
  public List<String> hello() {
    return Arrays.asList("hello","world");
  }
}