package ru.gb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReaderController {

    @GetMapping("reader/{id}")
    public String getById(@PathVariable long id) {
        return "Нашли читателя с id=" + id;
    }
}
