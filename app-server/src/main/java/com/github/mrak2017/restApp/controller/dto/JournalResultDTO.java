package com.github.mrak2017.restApp.controller.dto;

import java.util.List;

public class JournalResultDTO {

    public long total;
    public List<? extends JournalItemDTO> items;

    public JournalResultDTO(List<? extends JournalItemDTO> items) {
        if (items != null) {
            this.items = items;
            this.total = items.size();
        }
    }
}
