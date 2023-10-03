package org.gyula.winecompany.web.model.v2;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class WinePagedList extends PageImpl<WineDTOV2> {
    public WinePagedList(List<WineDTOV2> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public WinePagedList(List<WineDTOV2> content) {
        super(content);
    }
}
