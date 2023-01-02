package org.gyula.winecompany.services;

import org.gyula.winecompany.web.model.WineDTO;

import java.util.UUID;

public interface WineService {

    WineDTO getWineById(UUID wineId);

}
