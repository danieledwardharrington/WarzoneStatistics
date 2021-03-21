package com.dharringtondev.warzonestats.remote.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlayerModel(
    @SerialName("platform")
    var platform: String,

    @SerialName("username")
    var username: String,

    @SerialName("playerStats")
    var playerStats: PlayerStatsModel
)
