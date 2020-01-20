package io.redspark.games.service.impl

import io.redspark.games.Game
import io.redspark.games.service.GameService
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class GameServiceImpl : GameService {

    override fun getGames(): List<Game> {
        val csGo = Game("CS:GO", LocalDate.of(2012, 8, 21))
        val candyCrush = Game("Candy Crush", LocalDate.of(2012, 3, 12))
        val ageOfEmpires = Game("Age of Empires", LocalDate.of(1997, 9, 15))
        return listOf(csGo, candyCrush, ageOfEmpires)
    }

}