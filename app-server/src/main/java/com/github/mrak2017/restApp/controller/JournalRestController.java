package com.github.mrak2017.restApp.controller;

import com.github.mrak2017.restApp.controller.dto.*;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/journal")
public class JournalRestController {

    private final String QUESTIONS_JOURNAL_ID = "questions";

    private final List<JournalEntityDTO> journals = Arrays.asList(
            new JournalEntityDTO(QUESTIONS_JOURNAL_ID, "Вопросы", 15)
            );

    private final List<QuestionsJournalItemDTO> questions = Arrays.asList(
            new QuestionsJournalItemDTO("1", "Сколько было назгулов?", 4),
            new QuestionsJournalItemDTO("2", "Какой ответ на вопрос жизни вселенной и всего остального?", 4),
            new QuestionsJournalItemDTO("3", "Кто написал картину \"Мона Лиза\"?", 4),
            new QuestionsJournalItemDTO("4", "Какое первое правило бойцовского клуба?", 2),
            new QuestionsJournalItemDTO("5", "Как звали наставника главного героя в фильме \"Матрица\"?", 2),
            new QuestionsJournalItemDTO("6", "Что пытался вернуть герой фильма \"Большой Лебовски\"?", 3),
            new QuestionsJournalItemDTO("7", "Какова температура горения бумаги? Такое же название носит роман Рэя Бредбери", 4),
            new QuestionsJournalItemDTO("8", "С каким русским царем Иван Васильевич поменялся профессией?", 3),
            new QuestionsJournalItemDTO("9", "Как звали главного злодея в оригинальной трилогии \"Звездные войны\"?", 2),
            new QuestionsJournalItemDTO("10", "Как назывался парк, в котором поселили клонированных динозавров?", 2)
    );

    @GetMapping("{id}")
    JournalEntityDTO getJournalEntity(@PathVariable String id) {
        return journals.get(0);
    }

    @PutMapping("get-query")
    JournalResultDTO getQuery(@RequestBody JournalRequestDTO dto) {
        return new JournalResultDTO(questions);
    }
}
