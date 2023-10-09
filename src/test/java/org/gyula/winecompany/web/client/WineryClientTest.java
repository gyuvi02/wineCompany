package org.gyula.winecompany.web.client;

import org.gyula.winecompany.web.model.v2.WineDTOV2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WineryClientTest {

    @Autowired
    WineryClient client;

    @Test
    void getWineById() {
        WineDTOV2 wineDTOV2 = client.getWineById(UUID.randomUUID());

        assertNotNull(wineDTOV2);
    }
}