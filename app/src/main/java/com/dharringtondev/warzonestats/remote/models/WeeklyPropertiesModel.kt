package com.dharringtondev.warzonestats.remote.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeeklyPropertiesModel(@SerialName("killsPerGame")
                                 val killsPerGame: Double,

                                 @SerialName("headshotPercentage")
                                 val headshotPercentage: Double,

                                 @SerialName("deaths")
                                 val deaths: Int,

                                 @SerialName("avgLifeTime")
                                 val avgLifeTime: Double,

                                 @SerialName("kdRatio")
                                 val kdRatio: Double,

                                 @SerialName("kills")
                                 val kills: Int,

                                 @SerialName("score")
                                 val score: Long,

                                 @SerialName("scorePerMinute")
                                 val scorePerMinute: Double,

                                 @SerialName("timePlayed")
                                 val timePlayed: Long,

                                 @SerialName("gulagDeaths")
                                 val gulagDeaths: Int
                                 )
