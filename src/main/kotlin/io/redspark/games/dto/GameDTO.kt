package io.redspark.games.dto

import java.time.LocalDate

data class GameDTO(
        val id: String,
        val title: String,
        val releaseDate: LocalDate
)