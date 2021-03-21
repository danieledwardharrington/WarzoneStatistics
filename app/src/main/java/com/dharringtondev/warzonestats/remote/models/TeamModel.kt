package com.dharringtondev.warzonestats.remote.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TeamModel(
    @SerialName("name")
    var teamName: String,

    @SerialName("placement")
    var placement: Int,

    @SerialName("players")
    var players: MutableList<PlayerModel>
)