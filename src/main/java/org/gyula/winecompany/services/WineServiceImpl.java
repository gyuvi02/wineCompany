package org.gyula.winecompany.services;

import org.gyula.winecompany.web.model.WineDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class WineServiceImpl implements WineService {
    @Override
    public WineDTO getWineById(UUID wineId) {
        return WineDTO.builder().id(UUID.randomUUID())
                .wineName("Balatoni Furmint")
                .wineStyle("dry")
                .build();
    }
}
