package io.redspark.games.controller

import io.redspark.games.dto.CreateGameDTO
import io.redspark.games.dto.GameDTO
import io.redspark.games.service.GameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("games")
class GameController @Autowired constructor(
        private val gameService: GameService
) {

    @GetMapping
    fun getGames(): Flux<GameDTO> = gameService.getGames()

    @GetMapping("/{id}")
    fun findGameById(@PathVariable id: String): Mono<GameDTO> = gameService.getGameById(id)

    @PostMapping
    fun createGame(@RequestBody createGameDTO: CreateGameDTO): Mono<GameDTO> = gameService.createGame(createGameDTO)

    @PutMapping("/{id}")
    fun updateGame(@PathVariable id: String,
                   @RequestBody createGameDTO: CreateGameDTO): Mono<GameDTO> = gameService.update(id, createGameDTO)

    @DeleteMapping("/{id}")
    fun deleteGame(@PathVariable id: String): Mono<Void> = gameService.delete(id)

}