package io.redspark.games.controller

import io.redspark.games.dto.GameDTO
import io.redspark.games.dto.CreateGameDTO
import io.redspark.games.service.GameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("games")
class GameController @Autowired constructor(
        private val gameService: GameService
){

    @GetMapping
    fun getGames(): List<GameDTO> = gameService.getGames()

    @GetMapping("/{id}")
    fun findGameById(@PathVariable id: String): GameDTO = gameService.getGameById(id)

    @PostMapping
    fun createGame(@RequestBody createGameDTO: CreateGameDTO): GameDTO = gameService.createGame(createGameDTO)

    @PutMapping("/{id}")
    fun updateGame(@PathVariable id: String,
                    @RequestBody createGameDTO: CreateGameDTO): GameDTO = gameService.update(id, createGameDTO)

    @DeleteMapping("/{id}")
    fun deleteGame(@PathVariable id: String) = gameService.delete(id)

}