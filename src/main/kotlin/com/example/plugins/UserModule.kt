package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.aboutUs(){
    routing {
        get("/aboutus"){
            call.respondText { "Shivammmmm about" }
        }
    }
}