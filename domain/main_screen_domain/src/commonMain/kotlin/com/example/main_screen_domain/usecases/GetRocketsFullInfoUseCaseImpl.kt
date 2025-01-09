package com.example.main_screen_domain.usecases

import com.example.main_screen_domain.interfaces.GetRocketsFullInfoUseCase
import com.example.main_screen_domain.models.RocketFullInfoModel
import com.example.main_screen_domain.models.toRocketFullInfoModelList
import com.example.main_screen_domain.repository.MainScreenRepository

class GetRocketsFullInfoUseCaseImpl
    ( private val mainScreenRepository: MainScreenRepository ) : GetRocketsFullInfoUseCase {
    override suspend fun execute(): List<RocketFullInfoModel> {
        return mainScreenRepository.requestFullRocketsInfo().toRocketFullInfoModelList()
    }
}