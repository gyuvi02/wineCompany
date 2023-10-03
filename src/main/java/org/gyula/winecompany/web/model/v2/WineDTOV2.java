package org.gyula.winecompany.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class WineDTOV2 {
    private UUID id;
    private int version;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private String wineName;
    private WineStyle wineStyle;
    private Long upc;
    private BigDecimal price;
    private int quantityOnHand;

}
