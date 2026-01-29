package br.com.higitech.futSumula_hub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HubController {

    @GetMapping("/")
    public String index() {
        return "index.html"; // O Spring vai buscar isso em /static/ ou /templates/
    }
}