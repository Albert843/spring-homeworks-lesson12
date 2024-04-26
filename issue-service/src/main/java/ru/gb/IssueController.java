package ru.gb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IssueController {

    @GetMapping("issue/{id}")
    public String getById(@PathVariable long id) {
        return "Нашли issue с id=" + id;
    }

}
