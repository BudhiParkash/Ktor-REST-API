package com.example

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.tomcat.*
import com.example.plugins.*
import io.ktor.serialization.gson.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Tomcat, port = 8080, host = "192.168.1.46" , module = Application::module)
        .start(wait = true)
}


/*fun Routing.userRoutes(){
    get("/users") {
        call.respond("User Routes")

    }

    get("/") {
        call.respond("")
    }
}

fun Routing.likeRotes(){
    get("/like"){
        call.respond("Shivam like your post")
    }
}*/

fun Application.module() {
    configureSerialization()
    configureRouting()
    aboutUs()
}
