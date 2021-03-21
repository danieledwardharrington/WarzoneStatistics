package com.dharringtondev.warzonestats.remote.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CareerStatsModel(@SerialName("cash")
                            val cash: Long,

                            @SerialName("contracts")
                            val contracts: Int,

                            @SerialName("deaths")
                            val deaths: Int,

                            @SerialName("downs")
                            val downs: Int,

                            @SerialName("gamesPlayed")
                            val gamesPlayed: Int,

                            @SerialName("kdRatio")
                            val kdRatio: Double,

                            @SerialName("kills")
                            val kills: Int,

                            @SerialName("revives")
                            val revives: Int,

                            @SerialName("score")
                            val score: Long,

                            @SerialName("scorePerMinute")
                            val scorePerMinute: Double,

                            @SerialName("timePlayed")
                            val timePlayed: Long,

                            @SerialName("topFive")
                            val topFive: Int,

                            @SerialName("topTen")
                            val topTen: Int,

                            @SerialName("wins")
                            val wins: Int
                            )
