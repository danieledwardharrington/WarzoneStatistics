package com.dharringtondev.warzonestats.remote.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

data class MatchModel(
    @SerialName("matchId")
    private var matchId: String = "",

    @SerialName("duration")
    private var duration: Int = 0
) {


    class PlayerStats() {
        @SerialName("assists")
        private var assists: Int = 0

        @SerialName("damageDone")
        private var damageDone: Int = 0

        @SerialName("damageTaken")
        private var damageTaken: Int = 0

        @SerialName("deaths")
        private var deaths: Int = 0

        @SerialName("distanceTraveled")
        private var distanceTraveled: Double = 0.0

        @SerialName("headshots")
        private var headshots: Int = 0

        @SerialName("kdRatio")
        private var kdRatio: Double = 0.0

        @SerialName("kills")
        private var kills: Int = 0

        @SerialName("longestStreak")
        private var longestStreak: Int = 0

        @SerialName("percentTimeMoving")
        private var percentTimeMoving: Double = 0.0

        @SerialName("rank")
        private var rank: Int = 0

        @SerialName("score")
        private var score: Int = 0

        @SerialName("scorePerMinute")
        private var scorePerMinute: Double = 0.0

        @SerialName("timePlayed")
        private var timePlayed: Int = 0
    }
}