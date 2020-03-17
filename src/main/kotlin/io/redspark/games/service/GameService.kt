package io.redspark.games.service

import io.redspark.games.dto.CreateGameDTO
import io.redspark.games.dto.GameDTO
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface GameService {

    fun getGames(): Flux<GameDTO>
    fun getGameById(id: String): Mono<GameDTO>
    fun createGame(createGameDTO: CreateGameDTO): Mono<GameDTO>
    fun update(id: String, createGameDTO: CreateGameDTO): Mono<GameDTO>
    fun delete(id: String): Mono<Void>

}