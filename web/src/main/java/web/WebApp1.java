package web;

import legacy.LegacyConfig;
import logic.service.Service;
import logic.service.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Import({ServiceConfig.class, LegacyConfig.class})
@SpringBootApplication
public class WebApp1 {

    private final Service service;

    @Autowired
    public WebApp1(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return service.message();
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApp1.class, args);
    }
}
