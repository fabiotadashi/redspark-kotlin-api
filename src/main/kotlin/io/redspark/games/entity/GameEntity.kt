package io.redspark.games.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document
data class GameEntity(
        @Id
        val id: String? = null,
        val title: String,
        val releaseDate: LocalDate
)
