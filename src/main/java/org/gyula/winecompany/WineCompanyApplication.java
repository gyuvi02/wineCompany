package org.gyula.winecompany;

import org.gyula.winecompany.web.client.WineryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(WineryClient.class)
public class WineCompanyApplication {

    public static void main(String[] args) {
        SpringApplication.run(WineCompanyApplication.class, args);
    }

}
