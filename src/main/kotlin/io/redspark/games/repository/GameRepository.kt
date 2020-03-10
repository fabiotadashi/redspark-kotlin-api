package io.redspark.games.repository

import io.redspark.games.entity.GameEntity
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface GameRepository : ReactiveMongoRepository<GameEntity, String>