package org.gyula.winecompany.web.controller;

import org.gyula.winecompany.services.WineService;
import org.gyula.winecompany.web.model.WineDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Deprecated
@RestController
@RequestMapping("/api/v1/wine/")
public class WineController {

    private final WineService wineService;

    public WineController(WineService wineService) {
        this.wineService = wineService;
    }

    @GetMapping({"/{wineId}"})
    public ResponseEntity<WineDTO> getWine(@PathVariable ("wineId") UUID wineId) {
        return new ResponseEntity<>(wineService.getWineById(wineId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody WineDTO wineDTO) {
        WineDTO savedDto = wineService.saveNewWine(wineDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/wine " + savedDto.getId().toString());
        return new  ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{wineId}"})
    public ResponseEntity handleupdate(@PathVariable ("wineId") UUID wineId, @RequestBody WineDTO wineDTO) {
        wineService.updateWine(wineId, wineDTO);
        return new  ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{wineId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteWine(@PathVariable ("wineId") UUID windId) {
        wineService.deleteWine(windId);
    }
}
