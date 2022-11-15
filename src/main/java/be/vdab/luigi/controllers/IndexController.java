package be.vdab.luigi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
class IndexController {
    @GetMapping
    public String index() {
        String morgenOfMiddag = LocalDateTime.now().getHour() < 12 ? "morgen" : "middag";
        return "<!doctype html><html><title>Hallo</title><body>Goede "
                + morgenOfMiddag +
        "</body></html>";

    }
}
