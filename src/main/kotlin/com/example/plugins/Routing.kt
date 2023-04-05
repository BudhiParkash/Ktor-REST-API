package com.example.plugins

import com.google.gson.annotations.SerializedName
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    routing {

        get("/") {
         /*   call.respondText("Hello World!")*/

            println("Uri: ${call.request.uri}")
            println("Header: ${call.request.headers.names()}")
            println("User-Agent: ${call.request.headers["User-Agent"]}")
            println("Accept: ${call.request.headers["Accept"]}")
            println("Query Params: ${call.request.queryParameters.names()}")
            println("Name: ${call.request.queryParameters["name"]}")
            println("Email: ${call.request.queryParameters["email"]}")

            call.respond("Hello  Ktor working nice")
        }
    }


    routing {
        get("/userList/{pages}") {
            val pageNumber = call.parameters["pages"]
            call.respondText { "You are on page number: $pageNumber " }
        }
    }


    routing {
        post("/login") {
            val userInfo = call.receive<UserInfo>()

            println(userInfo)
            call.respondText { "working" }
        }
    }

    routing {
        get("/main") {
            call.respondText("Hello Shivam Main!")
        }
    }

    routing {

    }
}


data class UserInfo(
    val userName : String ,
    val email:String
)
