package com.cannybits.plugins

import com.cannybits.routes.root
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    

    routing {

        root()

       // Static plugin. Try to access `/static/index.html`
//        static("/static") {
//            resources("static")
//        }
    }
}
