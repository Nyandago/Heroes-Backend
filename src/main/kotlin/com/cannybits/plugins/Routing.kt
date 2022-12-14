package com.cannybits.plugins

import com.cannybits.routes.getAllHeroes
import com.cannybits.routes.root
import com.cannybits.routes.searchHeroes
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    

    routing {

        root()
        getAllHeroes()
        searchHeroes()

        static("/images") {
            resources("images")
        }
    }
}
