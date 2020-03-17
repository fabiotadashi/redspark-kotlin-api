package io.redspark.games.service.impl

import io.redspark.games.dto.CreateGameDTO
import io.redspark.games.dto.GameDTO
import io.redspark.games.entity.GameEntity
import io.redspark.games.repository.GameRepository
import io.redspark.games.service.GameService
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class GameServiceImpl constructor(
        private val gameRepository: GameRepository
) : GameService {

    override fun getGames(): Flux<GameDTO> = gameRepository.findAll()
            .map { GameDTO(it) }

    override fun getGameById(id: String): Mono<GameDTO> = gameRepository.findById(id)
            .map { GameDTO(it) }

    override fun createGame(createGameDTO: CreateGameDTO): Mono<GameDTO> =
            Mono.create<CreateGameDTO> { it.success(createGameDTO) }
                    .map { GameEntity(it) }
                    .flatMap { gameRepository.save(it) }
                    .map { GameDTO(it) }

    override fun update(id: String, createGameDTO: CreateGameDTO): Mono<GameDTO> = gameRepository.findById(id)
            .map { updateProperties(it, createGameDTO) }
            .flatMap { gameRepository.save(it) }
            .map { GameDTO(it) }

    private fun updateProperties(gameEntity: GameEntity, createGameDTO: CreateGameDTO): GameEntity =
            gameEntity.apply {
                title = createGameDTO.title
                releaseDate = createGameDTO.releaseDate
            }

    override fun delete(id: String): Mono<Void> = gameRepository.deleteById(id)

}