package com.sanjeev.pdf.generator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pdf")
public class PdfController {
    @PostMapping("/generate")
    public void generatePdf(){

    }
}
