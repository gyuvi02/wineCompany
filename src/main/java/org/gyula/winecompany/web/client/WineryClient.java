package org.gyula.winecompany.web.client;

import lombok.Data;
import org.gyula.winecompany.web.model.v2.WineDTOV2;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

//@Component
@ConfigurationProperties(value = "gyula.winery", ignoreUnknownFields = false)
public class WineryClient {

    public final String WINE_PATH_V2 = "/api/v2/wine/";

    private final RestTemplate restTemplate;

    private String apihost;

    public WineryClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public WineDTOV2 getWineById(UUID uuid) {
        return restTemplate.getForObject(apihost + WINE_PATH_V2 + uuid.toString(), WineDTOV2.class);
    }
    public void setApihost(String apihost) {
        this.apihost = apihost;
    }
}
