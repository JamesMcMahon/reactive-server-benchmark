package net.jamesmcmahon.reactiveserverbenchmark.data

import net.jamesmcmahon.reactiveserverbenchmark.model.Book
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface BookRepository : ReactiveCrudRepository<Book, Long>