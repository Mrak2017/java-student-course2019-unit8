package com.github.mrak2017.restApp.controller.dto;

public class QuestionsJournalItemDTO extends JournalItemDTO {

    public int answersCount;

    public QuestionsJournalItemDTO(String id, String name, int answersCount) {
        this.id = id;
        this.name = name;
        this.answersCount = answersCount;
    }
}
