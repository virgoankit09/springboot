package guru.springframework.didemo.controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements  GreetingService {


    @Override
    public void show() {
        System.out.println("Impl1");
    }
}
