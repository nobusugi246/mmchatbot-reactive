package com.github.nobusugi246.mmchatbot.dataset

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import java.time.LocalDateTime

@Document
data class Pomodoro (@Id val id: String? = null,
                     val title: String? = null,
                     val username: String? = null,
                     val startDateTime: LocalDateTime = LocalDateTime.now())

interface PomodoroRepository : ReactiveMongoRepository<Pomodoro, String>
