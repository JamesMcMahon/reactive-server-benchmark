//package net.jamesmcmahon.reactiveserverbenchmark.query
//
//import com.expediagroup.graphql.spring.operations.Query
//import net.jamesmcmahon.reactiveserverbenchmark.data.BookRepository
//import org.springframework.stereotype.Component
//
//@Component
//class BookQuery(
//        val bookRepository: BookRepository
//) : Query {
//    fun listBooks() = this.bookRepository.findAll()
//}