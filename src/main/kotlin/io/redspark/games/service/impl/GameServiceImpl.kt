package io.redspark.games.service.impl

import io.redspark.games.dto.CreateGameDTO
import io.redspark.games.dto.GameDTO
import io.redspark.games.service.GameService
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class GameServiceImpl : GameService {

    override fun getGames(): List<GameDTO> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getGameById(id: String): GameDTO {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createGame(createGameDTO: CreateGameDTO): GameDTO {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(id: String, createGameDTO: CreateGameDTO): GameDTO {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(id: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}