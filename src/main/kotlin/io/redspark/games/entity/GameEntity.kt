package io.redspark.games.entity

import io.redspark.games.dto.CreateGameDTO
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document
data class GameEntity(
        @Id
        val id: String? = null,
        var title: String,
        var releaseDate: LocalDate
) {
        constructor(createGameDTO: CreateGameDTO) : this(
                title = createGameDTO.title,
                releaseDate = createGameDTO.releaseDate
        )
}
