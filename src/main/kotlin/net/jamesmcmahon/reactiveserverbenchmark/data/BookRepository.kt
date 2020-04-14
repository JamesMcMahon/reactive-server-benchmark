package net.jamesmcmahon.reactiveserverbenchmark.data

import net.jamesmcmahon.reactiveserverbenchmark.model.Book
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Flux

interface BookRepository : ReactiveCrudRepository<Book, Long> {
    @Query("SELECT * FROM authors INNER JOIN books ON author_id = books.id;")
    override fun findAll(): Flux<Book>
}