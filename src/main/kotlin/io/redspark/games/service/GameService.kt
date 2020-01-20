package io.redspark.games.service

import io.redspark.games.Game

interface GameService {

    fun getGames(): List<Game>

}