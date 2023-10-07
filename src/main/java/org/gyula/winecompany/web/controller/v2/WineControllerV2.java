package org.gyula.winecompany.web.controller.v2;

import org.gyula.winecompany.services.v2.WineServiceV2;
import org.gyula.winecompany.web.model.v2.WineDTOV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v2/wine")
public class WineControllerV2 {
    private final WineServiceV2 wineServiceV2;

    public WineControllerV2(WineServiceV2 wineService) {
        this.wineServiceV2 = wineService;
    }

    @GetMapping({"/{wineId}"})
    public ResponseEntity<WineDTOV2> getWineById(@PathVariable("wineId") UUID wineId) {
        return new ResponseEntity<>(wineServiceV2.getWineById(wineId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody WineDTOV2 wineDTO) {
        WineDTOV2 savedDto = wineServiceV2.saveNewWine(wineDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/wine " + savedDto.getId().toString());
        return new  ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{wineId}"})
    public ResponseEntity handleupdate(@PathVariable ("wineId") UUID wineId, @RequestBody WineDTOV2 wineDTO) {
        wineServiceV2.updateWine(wineId, wineDTO);
        return new  ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{wineId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteWine(@PathVariable ("wineId") UUID windId) {
        wineServiceV2.deleteWine(windId);
    }

}

