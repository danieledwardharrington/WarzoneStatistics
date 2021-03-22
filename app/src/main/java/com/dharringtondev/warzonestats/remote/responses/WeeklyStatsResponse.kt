package com.dharringtondev.warzonestats.remote.responses

import com.dharringtondev.warzonestats.remote.models.WeeklyStatsModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeeklyStatsResponse(@SerialName("wz")
                               val weeklyStats: WeeklyStatsModel)
