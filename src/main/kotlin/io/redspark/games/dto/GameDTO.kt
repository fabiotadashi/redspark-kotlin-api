package io.redspark.games.dto

import io.redspark.games.entity.GameEntity
import java.lang.Exception
import java.time.LocalDate

data class GameDTO(
        val id: String,
        val title: String,
        val releaseDate: LocalDate
) {
    constructor(gameEntity: GameEntity) : this(
            id = gameEntity.id ?: throw Exception("Invalid entity"),
            title = gameEntity.title,
            releaseDate = gameEntity.releaseDate
    )
}