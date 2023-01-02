package org.gyula.winecompany.web.controller;

import org.gyula.winecompany.services.WineService;
import org.gyula.winecompany.web.model.WineDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/wine")
public class WineController {

    private final WineService wineService;

    public WineController(WineService wineService) {
        this.wineService = wineService;
    }

    @GetMapping({"/{wineId}"})
    public ResponseEntity<WineDTO> getWine(@PathVariable ("wineId") UUID wineId) {
        return new ResponseEntity<>(wineService.getWineById(wineId), HttpStatus.OK);
    }
}
