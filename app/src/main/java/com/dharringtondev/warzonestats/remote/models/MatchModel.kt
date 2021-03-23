package com.dharringtondev.warzonestats.remote.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MatchModel(
    @SerialName("matchId")
    var matchId: String,

    @SerialName("duration")
    var duration: Int,

    @SerialName("playerStats")
    var playerStats: PlayerStatsModel,

    @SerialName("gameType")
    var gameType: String,

    @SerialName("privateMatch")
    var isPrivateMatch: Boolean,

    @SerialName("rankedTeams")
    var rankedTeams: MutableList<TeamModel>,

    @SerialName("teamCount")
    var teamCount: Int,

    @SerialName("playerCount")
    var playerCount: Int
)