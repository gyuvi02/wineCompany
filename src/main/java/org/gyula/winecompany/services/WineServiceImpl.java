package org.gyula.winecompany.services;

import lombok.extern.slf4j.Slf4j;
import org.gyula.winecompany.web.model.WineDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class WineServiceImpl implements WineService {
    @Override
    public WineDTO saveNewWine(WineDTO wineDTO) {
        return WineDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public WineDTO getWineById(UUID wineId) {
        return WineDTO.builder()
                .id(UUID.randomUUID())
                .wineName("Balatoni Furmint")
                .wineStyle("dry")
                .build();
    }

    @Override
    public void updateWine(UUID wineId, WineDTO wineDTO) {
        //todo - the update method doesn't exist yet
    }

    @Override
    public void deleteWine(UUID windId) {
        log.debug("Deleting a wine here");
    }

}
