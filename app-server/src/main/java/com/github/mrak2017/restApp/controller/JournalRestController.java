package com.github.mrak2017.restApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/journal/")
public class JournalRestController {

    @GetMapping("journal")
    String getForJournal(@RequestParam(required = false) String q) {
        return "hello world";
    }
}
