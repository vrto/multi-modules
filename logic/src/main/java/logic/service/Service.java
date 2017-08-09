package logic.service;

import org.springframework.stereotype.Component;

@Component
public class Service {

    public String message() {
        return "hello from service module";
    }
}
