package com.github.nobusugi246.mmchatbot

import com.github.nobusugi246.mmchatbot.dataset.PomodoroRepository
import com.github.nobusugi246.mmchatbot.dataset.User
import com.github.nobusugi246.mmchatbot.dataset.UserRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.beans.factory.annotation.Autowired
import reactor.core.publisher.Flux
import java.time.LocalDateTime

@RunWith(SpringRunner::class)
@SpringBootTest
class ProtoApplicationTests {

    val logger = logger()
    
	@Autowired
	var pomodoroRepository: PomodoroRepository? = null

	@Autowired
	var userRepository: UserRepository? = null

	@Test
	fun contextLoads() {
	}

	@Test
	fun userRepositoryTest(){
		userRepository?.deleteAll()
				?.thenMany(
						Flux.just("A", "B", "C", "D")
								.map { User(name = it, lastLoginDate = LocalDateTime.now()) }
								.flatMap { userRepository?.save(it) })
				?.thenMany(userRepository!!.findAll())
				?.subscribe {
					logger.info(it.toString())
				}
	}

}

