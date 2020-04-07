package net.jamesmcmahon.reactiveserverbenchmark.controller

import net.jamesmcmahon.reactiveserverbenchmark.data.BookRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("books")
class BookController(val bookRepository: BookRepository) {

    @GetMapping
    fun list() = bookRepository.findAll()

}