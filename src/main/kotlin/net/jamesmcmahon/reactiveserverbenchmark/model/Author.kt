package net.jamesmcmahon.reactiveserverbenchmark.model

import org.springframework.data.relational.core.mapping.Table

@Table("authors")
data class Author(
        val id: Long,
        val firstName: String,
        val lastName: String
)