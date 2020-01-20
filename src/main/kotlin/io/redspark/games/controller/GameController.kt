package io.redspark.games.controller

import io.redspark.games.Game
import io.redspark.games.service.GameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("games")
class GameController @Autowired constructor(
        private val gameService: GameService
){

    @GetMapping
    fun getGames(): List<Game> = gameService.getGames()

}