package com.dharringtondev.warzonestats.remote.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeeklyPropertiesObjectModel(@SerialName("properties")
                                       val weekStats: WeeklyPropertiesModel)
