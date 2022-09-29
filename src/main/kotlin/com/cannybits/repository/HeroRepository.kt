package com.cannybits.repository

import com.cannybits.models.ApiResponse
import com.cannybits.models.Hero


interface HeroRepository {

    val heroes: Map<Int, List<Hero>>  //int for page, list for heroes in the page

    val page1: List<Hero>
    val page2: List<Hero>
    val page3: List<Hero>
    val page4: List<Hero>
    val page5: List<Hero>


    suspend fun getAllHeroes(page: Int = 1): ApiResponse
    suspend fun searchHero(name: String?): ApiResponse
}