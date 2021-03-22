package com.dharringtondev.warzonestats.remote.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeeklyStatsModel(@SerialName("mode")
                            val gameModes: WeeklyModeModel)
