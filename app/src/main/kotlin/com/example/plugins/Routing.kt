package com.example.plugins

import com.example.greet
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            val name = call.request.queryParameters["name"]
            call.respondText(greet(name))
        }
    }
}
