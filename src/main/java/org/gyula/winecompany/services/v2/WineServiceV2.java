package org.gyula.winecompany.services.v2;

import org.gyula.winecompany.web.model.v2.WineDTOV2;

import java.util.UUID;

public interface WineServiceV2 {

    WineDTOV2 getWineById(UUID wineId);

    WineDTOV2 saveNewWine(WineDTOV2 wineDTO);

    void updateWine(UUID wineId, WineDTOV2 wineDTO);

    void deleteWine(UUID windId);

}
