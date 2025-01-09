package com.example.main_screen_domain.interfaces

import com.example.main_screen_domain.models.RocketFullInfoModel

interface GetRocketsFullInfoUseCase {
    suspend fun execute(): List<RocketFullInfoModel>
}