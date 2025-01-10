package com.example.main_screen_domain.interfaces

import com.example.main_screen_domain.models.RequestInfoList


interface GetRocketsBasicInfoUseCase {
    suspend fun execute() : List<RequestInfoList.RocketBasicInfoList>
}