package guru.springframework.spring5weppapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${gtsfi.property}")
    private String gtsfi;

    public String getGtsfi() {
        return gtsfi;
    }

    public void setGtsfi(String gtsfi) {
        this.gtsfi = gtsfi;
    }
}
