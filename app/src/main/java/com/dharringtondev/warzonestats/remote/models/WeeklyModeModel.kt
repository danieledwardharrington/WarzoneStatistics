package com.dharringtondev.warzonestats.remote.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeeklyModeModel(@SerialName("br_brsolo")
                           val solosStats: WeeklyPropertiesObjectModel,

                           @SerialName("br_brduos")
                           val duosStats: WeeklyPropertiesObjectModel,

                           @SerialName("br_brtrios")
                           val triosStats: WeeklyPropertiesObjectModel,

                           @SerialName("br_brquads")
                           val quadsStats: WeeklyPropertiesObjectModel,

                           @SerialName("br_all")
                           val combinedStats: WeeklyPropertiesObjectModel
                           )
