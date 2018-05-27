package guru.springframework.didemo.controllers;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class GreetintServiceImpl2 implements GreetingService {

    @Override
    public void show() {
        System.out.println("Hello 2");
    }
}
