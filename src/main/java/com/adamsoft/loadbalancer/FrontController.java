package com.adamsoft.loadbalancer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FrontController {

    @GetMapping("/")
    public String index() {
        log.info("로드밸런싱");
        return "index";
    }
}
