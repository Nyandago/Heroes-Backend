package com.cannybits.di


import com.cannybits.repository.HeroRepository
import com.cannybits.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository>{
        HeroRepositoryImpl()
    }
}
