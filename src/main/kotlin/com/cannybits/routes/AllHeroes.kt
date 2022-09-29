package com.cannybits.routes

import com.cannybits.models.ApiResponse
import com.cannybits.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

import java.lang.NumberFormatException

fun Route.getAllHeroes(){

    val heroRepository: HeroRepository by inject()

  get("/cannyville/heroes"){
     try {
         val page = call.request.queryParameters["page"]?.toInt() ?: 1
         require(page in 1..5)

         val apiResponse = heroRepository.getAllHeroes(page)

         call.respond(message = apiResponse,
                      status = HttpStatusCode.OK
             )

     } catch (e: NumberFormatException){
         call.respond(
             message = ApiResponse(success = false, message = "Only Numbers Allowed"),
             status = HttpStatusCode.BadRequest
         )
     }
      catch (e: IllegalArgumentException){
          call.respond(
              message = ApiResponse(success = false, message = "Heroes not found"),
              status = HttpStatusCode.NotFound
          )
      }
  }
}