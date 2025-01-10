package com.example.main_screen_domain.usecases

import com.example.main_screen_domain.interfaces.GetRocketsFullInfoUseCase
import com.example.main_screen_domain.models.RequestInfoList
import com.example.main_screen_domain.mappers.toRocketFullInfoModelList
import com.example.main_screen_domain.repository.MainScreenRepository

class GetRocketsFullInfoUseCaseImpl
    ( private val mainScreenRepository: MainScreenRepository ) : GetRocketsFullInfoUseCase {
    override suspend fun execute(): List<RequestInfoList.RocketFullInfoList> {
        return mainScreenRepository.requestFullRocketsInfo().toRocketFullInfoModelList()
    }
}