package net.jamesmcmahon.reactiveserverbenchmark.model

import org.springframework.data.relational.core.mapping.Embedded
import org.springframework.data.relational.core.mapping.Embedded.OnEmpty.*
import org.springframework.data.relational.core.mapping.Table

@Table("books")
data class Book(
        val id: Long,
        val name: String,
        val pageCount: Int,
        @Embedded(onEmpty = USE_NULL)
        val author: Author?
) {
        init {
            println("id $id")
            println("name $name")
            println("pageCount $pageCount")
            println("author $author")
        }
}