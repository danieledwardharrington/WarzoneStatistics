package com.dharringtondev.warzonestats.remote.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlayerStatsModel(
    @SerialName("assists")
    var assists: Int,

    @SerialName("damageDone")
    var damageDone: Int,

    @SerialName("damageTaken")
    var damageTaken: Int,

    @SerialName("deaths")
    var deaths: Int,

    @SerialName("distanceTraveled")
    var distanceTraveled: Double,

    @SerialName("headshots")
    var headshots: Int,

    @SerialName("kdRatio")
    var kdRatio: Double,

    @SerialName("kills")
    var kills: Int,

    @SerialName("longestStreak")
    var longestStreak: Int,

    @SerialName("percentTimeMoving")
    var percentTimeMoving: Double,

    @SerialName("rank")
    var rank: Int,

    @SerialName("score")
    var score: Int,

    @SerialName("scorePerMinute")
    var scorePerMinute: Double,

    @SerialName("timePlayed")
    var timePlayed: Int
) {
}