package com.example.demo

import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HtmlController {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Blog"
        return "blog"
    }

    @GetMapping("/hello")
    fun helloHandler(model: Model): String {
        model["title"] = "Hello World"
        return "Fuck you"
    }

}