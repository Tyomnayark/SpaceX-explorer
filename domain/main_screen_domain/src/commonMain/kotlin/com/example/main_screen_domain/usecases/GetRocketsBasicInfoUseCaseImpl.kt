package com.example.main_screen_domain.usecases

import com.example.main_screen_domain.interfaces.GetRocketsBasicInfoUseCase
import com.example.main_screen_domain.mappers.toRocketBasicInfo
import com.example.main_screen_domain.models.RequestInfoList
import com.example.main_screen_domain.repository.MainScreenRepository

class GetRocketsBasicInfoUseCaseImpl(
    private val mainScreenRepository: MainScreenRepository
): GetRocketsBasicInfoUseCase {
    override suspend fun execute(): List<RequestInfoList.RocketBasicInfoList> {
        return mainScreenRepository.requestBasicRocketsInfo().toRocketBasicInfo()
    }
}