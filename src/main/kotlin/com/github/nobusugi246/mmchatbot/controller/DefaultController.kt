package com.github.nobusugi246.mmchatbot.controller

import com.github.nobusugi246.mmchatbot.logger
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class DefaultController() {
    val logger = logger()
    val token = "szrahwcwwby7ubyru1smt4up5h"

    @PostMapping("/pomo")
    fun pomo(@RequestBody request: String) {
        logger.info("pomo called")
        logger.info(request)
    }

    @PostMapping("/start")
    fun start(@RequestBody request: String) {
        logger.info("start called")
        logger.info(request)
    }

    @PostMapping("/stop")
    fun stop() {
        logger.info("stop called")
    }

    @PostMapping("/restart")
    fun restart() {
        logger.info("restart called")
    }

    @PostMapping("/cancel")
    fun cancel() {
        logger.info("cancel called")
    }
}
