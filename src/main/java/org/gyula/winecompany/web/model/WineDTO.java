package org.gyula.winecompany.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WineDTO {

    private UUID id;
    private String wineName;
    private String wineStyle;
    private Long upc;
}
