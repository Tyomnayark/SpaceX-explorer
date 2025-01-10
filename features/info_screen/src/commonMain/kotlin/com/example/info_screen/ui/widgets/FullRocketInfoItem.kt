package com.example.info_screen.ui.widgets

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.core_resources.Colors
import com.example.main_screen_domain.models.RequestInfoList
import org.jetbrains.compose.resources.stringResource
import src.commonMain.composeResources.Res
import src.commonMain.composeResources.active
import src.commonMain.composeResources.boosters
import src.commonMain.composeResources.company
import src.commonMain.composeResources.cost_per_launch
import src.commonMain.composeResources.country
import src.commonMain.composeResources.description
import src.commonMain.composeResources.stages
import src.commonMain.composeResources.success_rate_pct
import src.commonMain.composeResources.type
import src.commonMain.composeResources.wikipedia

@Composable
fun FullRocketInfoItem(
    modifier: Modifier = Modifier,
    info: RequestInfoList.RocketFullInfoList
) {
    Box {
        Column(
            modifier = Modifier
                .padding(
                    start = 50.dp,
                    top = 60.dp
                )
        ) {
            InfoCard(
                modifier = modifier,
                isDecorationNeed = true,
                text = stringResource(Res.string.boosters, info.boosters),
                color = Colors.green
            )
            InfoCard(
                modifier = modifier,
                isDecorationNeed = true,
                text = stringResource(Res.string.active, info.active),
                color = Colors.red
            )
            InfoCard(
                modifier = modifier,
                isDecorationNeed = true,
                text = stringResource(Res.string.company, info.company),
                color = Colors.purple
            )
            InfoCard(
                modifier = modifier,
                isDecorationNeed = true,
                text = stringResource(Res.string.cost_per_launch, info.costPerLaunch),
                color = Colors.blue
            )
            InfoCard(
                modifier = modifier,
                isDecorationNeed = true,
                text = stringResource(Res.string.country, info.country),
                color = Colors.yellow
            )
            InfoCard(
                modifier = modifier,
                isDecorationNeed = true,
                text = stringResource(Res.string.description, info.description),
                color = Colors.darkBlue
            )
            InfoCard(
                modifier = modifier,
                isDecorationNeed = true,
                text = stringResource(Res.string.stages, info.stages),
                color = Colors.darkGrey
            )
            InfoCard(
                modifier = modifier,
                isDecorationNeed = true,
                text = stringResource(Res.string.success_rate_pct, info.successRatePct),
                color = Colors.gray
            )
            InfoCard(
                modifier = modifier,
                isDecorationNeed = true,
                text = stringResource(Res.string.type, info.type),
                color = Colors.darkGreen
            )
            InfoCard(
                modifier = modifier,
                isDecorationNeed = true,
                text = stringResource(Res.string.wikipedia, info.wikipedia),
                color = Colors.darkRed
            )
        }

        InfoCard(
            modifier = modifier,
            text = info.name
        )
    }
}