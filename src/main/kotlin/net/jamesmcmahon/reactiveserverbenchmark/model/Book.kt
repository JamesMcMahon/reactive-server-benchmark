package net.jamesmcmahon.reactiveserverbenchmark.model

import org.springframework.data.relational.core.mapping.Table

@Table("books")
data class Book(
        val id: Long,
        val name: String,
        val pageCount: Int
)