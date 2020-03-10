package io.redspark.games.dto

import java.time.LocalDate

data class CreateGameDTO (
        val title: String,
        val releaseDate: LocalDate
)
