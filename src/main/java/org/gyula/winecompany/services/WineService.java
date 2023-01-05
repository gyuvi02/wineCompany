package org.gyula.winecompany.services;

import org.gyula.winecompany.web.model.WineDTO;

import java.util.UUID;

public interface WineService {

    WineDTO saveNewWine(WineDTO wineDTO);

    WineDTO getWineById(UUID wineId);


    void updateWine(UUID wineId, WineDTO wineDTO);

    void deleteWine(UUID windId);
}
