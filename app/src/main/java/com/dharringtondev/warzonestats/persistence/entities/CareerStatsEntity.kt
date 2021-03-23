package com.dharringtondev.warzonestats.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "career_table")
data class CareerStatsEntity(@ColumnInfo(name = "cash")
                             val cash: Long,

                             @ColumnInfo(name = "contracts")
                             val contracts: Int,

                             @ColumnInfo(name = "deaths")
                             val deaths: Int,

                             @ColumnInfo(name = "downs")
                             val downs: Int,

                             @ColumnInfo(name = "games_played")
                             val gamesPlayed: Int,

                             @ColumnInfo(name = "kd_ratio")
                             val kdRatio: Double,

                             @ColumnInfo(name = "kills")
                             val kills: Int,

                             @ColumnInfo(name = "revives")
                             val revives: Int,

                             @ColumnInfo(name = "score")
                             val score: Long,

                             @ColumnInfo(name = "score_per_minute")
                             val scorePerMinute: Double,

                             @ColumnInfo(name = "time_played")
                             val timePlayed: Long,

                             @ColumnInfo(name = "top_five")
                             val topFive: Int,

                             @ColumnInfo(name = "top_ten")
                             val topTen: Int,

                             @ColumnInfo(name = "wins")
                             val wins: Int,

                             @ColumnInfo(name = "player_name")
                             val playerName: String,

                             @ColumnInfo(name = "platform")
                             val platform: String,

                             @PrimaryKey(autoGenerate = true)
                             var id: Long
)
