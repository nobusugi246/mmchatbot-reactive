package com.github.nobusugi246.mmchatbot.dataset

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import java.time.LocalDateTime

@Document
data class User (@Id val id: String? = null,
                 val name: String? = null,
                 val lastLoginDate: LocalDateTime)

interface UserRepository : ReactiveMongoRepository<User, String>
