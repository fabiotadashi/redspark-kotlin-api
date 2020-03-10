package io.redspark.games.service

import io.redspark.games.dto.CreateGameDTO
import io.redspark.games.dto.GameDTO

interface GameService {

    fun getGames(): List<GameDTO>
    fun getGameById(id: String): GameDTO
    fun createGame(createGameDTO: CreateGameDTO): GameDTO
    fun update(id: String, createGameDTO: CreateGameDTO): GameDTO
    fun delete(id: String)

}