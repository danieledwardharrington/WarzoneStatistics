package com.dharringtondev.warzonestats.remote.responses

import com.dharringtondev.warzonestats.remote.models.CareerStatsModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StatsResponse(@SerialName("br")
                         val careerStats: CareerStatsModel)
