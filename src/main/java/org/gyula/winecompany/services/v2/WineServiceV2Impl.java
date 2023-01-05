package org.gyula.winecompany.services.v2;

import lombok.extern.slf4j.Slf4j;
import org.gyula.winecompany.web.model.WineDTO;
import org.gyula.winecompany.web.model.v2.WineDTOV2;
import org.gyula.winecompany.web.model.v2.WineStyle;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class WineServiceV2Impl implements WineServiceV2 {
    @Override
    public WineDTOV2 getWineById(UUID wineId) {
        return WineDTOV2.builder()
                .id(UUID.randomUUID())
                .wineName("Balatoni Furmint")
                .wineStyle(WineStyle.DRY)
                .build();
    }

    @Override
    public WineDTOV2 saveNewWine(WineDTOV2 wineDTO) {
        return WineDTOV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateWine(UUID wineId, WineDTOV2 wineDTO) {
        //todo - the update method doesn't exist yet
    }

    @Override
    public void deleteWine(UUID windId) {
        log.debug("Deleting a wine here");
    }
}
